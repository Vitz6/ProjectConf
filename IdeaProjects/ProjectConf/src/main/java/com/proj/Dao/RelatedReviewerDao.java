package com.proj.Dao;

import com.proj.Model.RelatedReviewer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wincenty on 5/3/2016.
 */
@Repository
public class RelatedReviewerDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<RelatedReviewer> getAllRelatedReviewer()
    {
        Query query = entityManager.createQuery("FROM  RelatedReviewer rr ");
        return (List<RelatedReviewer>) query.getResultList();    }


    @Transactional
    public void createComment(RelatedReviewer relatedReviewer) {
        entityManager.persist(relatedReviewer);
    }

}
