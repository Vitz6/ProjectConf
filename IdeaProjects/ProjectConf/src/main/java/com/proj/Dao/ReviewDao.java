package com.proj.Dao;

import com.proj.Model.Review;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wincenty on 5/3/2016.
 */
@Repository
public class ReviewDao {


    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Review> getAllReviews()
    {
        Query query = entityManager.createQuery("FROM Review rev");
        return query.getResultList();
    }

    @Transactional
    public void setReview(@RequestBody Review review)
    {
        entityManager.persist(review);
    }
}
