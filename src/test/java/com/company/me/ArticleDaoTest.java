package com.company.me;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.me.article.domain.Article;
import com.company.me.article.persistence.ArticleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ArticleDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleDaoTest.class);
	@Inject
	private ArticleDao articleDao;
	
	
//	@Test
//	public void testCreate() throws Exception{
//		Article article = new Article();
//		article.setTitle("새로운글 작성 테스트 제목");
//		article.setContent("새로운 글 작성 테스트 내용");
//		article.setWriter("새로운 글 작성자");
//		articleDao.create(article);
//	}
	
	@Test
	public void testRead() throws Exception{
		logger.info(articleDao.read(1).toString());
	}
	
//	@Test
//	public void testUpdate() throws Exception{
//		Article article = new Article();
//		article.setArticleNo(1);
//		article.setTitle("글 수정 테스트 제목");
//		article.setContent("글 수정 테스트 내용");
//		articleDao.update(article);
//	}
	
//	@Test
//	public void testDelete() throws Exception{
//		articleDao.delete(2);
//	}

}
