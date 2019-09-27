package com.company.me.article.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.company.me.article.domain.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Inject
    private SqlSession sqlSession;

    private static final String NAMESPACE = "com.company.me.mappers.article.ArticleMapper";

    // 게시글 입력
    @Override
    public void create(Article article) throws Exception {
        sqlSession.insert(NAMESPACE + ".create", article);
    }

    // 게시글 조회
    @Override
    public Article read(Integer articleNo) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".read", articleNo);
    }

    // 게시글 수정
    @Override
    public void update(Article article) throws Exception {
        sqlSession.update(NAMESPACE + ".update", article);
    }

    // 게시글 삭제
    @Override
    public void delete(Integer articleNo) throws Exception {
        sqlSession.delete(NAMESPACE + ".delete", articleNo);
    }

    // 게시글 전체 목록
    @Override
    public List<Article> listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".listAll");
    }

}
