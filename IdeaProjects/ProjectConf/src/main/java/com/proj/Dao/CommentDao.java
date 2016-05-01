package com.proj.Dao;

import com.proj.Model.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wincenty on 4/26/2016.
 */
@Repository //czyli odpowiada za dostep danych
public class CommentDao {


    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Comment> findAllComment() {
        Query query = entityManager.createQuery("FROM Comment com");
        return (List<Comment>) query.getResultList();
    }

    @Transactional
      public Comment findById(Long id)
    {
        Query query = entityManager.createQuery("FROM Comment com WHERE com.id=" + id);
        return (Comment) query.getResultList();
    }

    @Transactional
    public void createComment(Comment comment) {
        entityManager.persist(comment);
    }
}
