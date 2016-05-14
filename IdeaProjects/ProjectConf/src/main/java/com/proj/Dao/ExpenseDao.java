package com.proj.Dao;

import com.proj.Model.Expense;
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
public class ExpenseDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Expense> findAllComment() {
        Query query = entityManager.createQuery("FROM Expense ex");
        return (List<Expense>) query.getResultList();
    }

    @Transactional
    public void createComment(Expense expense) {
        entityManager.persist(expense);
    }

}
