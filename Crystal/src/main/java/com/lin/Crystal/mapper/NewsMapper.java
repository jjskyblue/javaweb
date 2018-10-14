package com.lin.Crystal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lin.Crystal.entry.NewsEntry;

public interface NewsMapper {
	@Select("SELECT n_id,n_title,n_source,n_star FROM NEWS")
	@Results({
		@Result(property = "id",  column = "n_id" ),
		@Result(property = "title", column = "n_title"),
		@Result(property = "source", column = "n_source"),
		@Result(property = "star", column = "n_star")
	})
	List<NewsEntry> getAll();

}
