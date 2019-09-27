package com.company.me.article.service;

import java.util.List;

import com.company.me.article.domain.Article;

public interface ArticleService {
	
	void create(Article article) throws Exception;
	
	Article read(Integer articleNo) throws Exception;
	
	void update(Article article) throws Exception;
	
	void delete(Integer articleNo) throws Exception;
	
	List<Article> listAll() throws Exception;
}
