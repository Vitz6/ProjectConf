package com.proj.Dao;

import com.proj.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wincenty on 5/1/2016.
 */
@Repository
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<User> findAllComment() {
        Query query = entityManager.createQuery("FROM Users user");
        return (List<User>) query.getResultList();
    }

    @Transactional
    public User findById(int id) {
        Query query = entityManager.createQuery("FROM Users user WHERE user.id=" + id);
        return (User) query.getResultList();
    }


    @Transactional
    public void deleteUser(User user) {
        Query query = entityManager.createQuery("DELETE FROM Users user WHERE user.id=" + user.getId());
    }


    @Transactional
    public void createUser(User user) {
        entityManager.persist(user);
    }

}
