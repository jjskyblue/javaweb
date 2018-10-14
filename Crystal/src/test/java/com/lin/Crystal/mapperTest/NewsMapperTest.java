package com.lin.Crystal.mapperTest;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lin.Crystal.entry.NewsEntry;
import com.lin.Crystal.mapper.NewsMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsMapperTest {
	@Autowired
	private NewsMapper newsMapper;
	
	@Test
	public void TestQuery()throws Exception{
		List<NewsEntry> news = newsMapper.getAll();
		for (Iterator iterator = news.iterator(); iterator.hasNext();) {
			NewsEntry newsEntry = (NewsEntry) iterator.next();
			System.out.println("news--list:"+newsEntry.getTitle());
		}
		
	}
	
	

}
