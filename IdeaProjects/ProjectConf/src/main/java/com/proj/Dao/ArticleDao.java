package com.proj.Dao;

import com.proj.Model.Article;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wincenty on 5/21/2016.
 */

@Repository
public class ArticleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Article> findAllArticles() {
        Query query = entityManager.createQuery("FROM Article art");
        return (List<Article>) query.getResultList();
    }


    @Transactional
    public void createArticle(Article article) {
        entityManager.persist(article);
    }
}
