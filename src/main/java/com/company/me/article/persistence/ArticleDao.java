package com.company.me.article.persistence;

import java.util.List;

import com.company.me.article.domain.Article;

public interface ArticleDao {

	void create(Article article) throws Exception;
	
	Article read(Integer articleNo) throws Exception;
	
	void update(Article article) throws Exception;
	
	void delete(Integer articleNo) throws Exception;
	
	List<Article> listAll() throws Exception;
}
