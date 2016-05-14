package com.proj.Dao;

import com.proj.Model.Conference;
import com.proj.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ConferenceDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Conference> findAllConferences() {
        Query query = entityManager.createQuery("FROM Conference c");
        return (List<Conference>) query.getResultList();
    }

    @Transactional
    public void addConference(Conference conference)
    {
        entityManager.persist(conference);

    }

}
