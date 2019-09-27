package com.company.me.article.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.company.me.article.domain.Article;
import com.company.me.article.persistence.ArticleDao;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	private final ArticleDao articleDao;
	
	@Inject
	public ArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao=articleDao;
	}

	@Override
	public void create(Article article) throws Exception {
		articleDao.create(article);
	}

	@Override
	public Article read(Integer articleNo) throws Exception {
		return articleDao.read(articleNo);
	}

	@Override
	public void update(Article article) throws Exception {
		articleDao.update(article);
	}

	@Override
	public void delete(Integer articleNo) throws Exception {
		articleDao.delete(articleNo);
	}

	@Override
	public List<Article> listAll() throws Exception {
		return articleDao.listAll();
	}
	
	

}
