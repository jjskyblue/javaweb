package com.lin.Crystal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lin.Crystal.entry.NewsEntry;
import com.lin.Crystal.service.NewsService;

@RestController
public class NewsController {

	@Autowired
	NewsService newsService;
	
	@RequestMapping("/index")
	public String index(){
		return "hello spring boot";
	}

	@RequestMapping("/get_news_list")
	public String getNews(){
		List<NewsEntry> newsList = newsService.getAll();
		System.out.println("news  list"+newsList.size());
		return "news";
	}
}
