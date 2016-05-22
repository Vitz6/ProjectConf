package com.proj.Dao;

import com.proj.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.invoke.empty.Empty;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.constraints.Null;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by wincenty on 5/1/2016.
 */
@Repository
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<User> findAllComment() {
        Query query = entityManager.createQuery("FROM User user");
        return (List<User>) query.getResultList();
    }


    @Transactional
    public User showUser(int id) {
        User user = new User();
        user = entityManager.find(User.class, id);
        return user;
    }

    @Transactional
    public boolean loginUser(User user) {  // If user exists (with this password) return true
        Query query = entityManager.createQuery("FROM User us  WHERE us.login='" + user.getLogin() + "'");
        boolean existChecker = FALSE;
        User user2 = new User();

        try {
            user2 = (User) query.getSingleResult();
            if (user2.getPassword().equals( user.getPassword())) existChecker =  TRUE; // the same user
            }
        catch (NoResultException e) { // brak takiego usera
            existChecker  = FALSE;
        }

        return existChecker;
    }


    @Transactional //Jesli nazwa wolna to zwroci 1
    public boolean checkName(User user) {
        Query query = entityManager.createQuery("FROM User us  WHERE us.login='" + user.getLogin() + "'");
    boolean czyWolna = FALSE;

        try {
            User user2 = (User) query.getSingleResult();
            if (user2.getLogin() == user.getLogin()) czyWolna = FALSE; //zajeta

        } catch (NoResultException e) { // jesli nie znaleziono takiej naazwy
            czyWolna  = TRUE;
        }
        catch (NonUniqueResultException e) { // duzo takich nazw
        czyWolna  = FALSE;
        }

        return czyWolna;
    }


    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
    }


    @Transactional
    public void createUser(User user) {
        entityManager.persist(user);

    }


}
