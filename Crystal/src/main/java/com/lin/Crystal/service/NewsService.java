package com.lin.Crystal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.Crystal.entry.NewsEntry;
import com.lin.Crystal.mapper.NewsMapper;

@Service
public class NewsService {
	
	@Autowired
	private NewsMapper newsMapper;
	public List<NewsEntry> getAll(){
		return newsMapper.getAll();
		
	}

}
