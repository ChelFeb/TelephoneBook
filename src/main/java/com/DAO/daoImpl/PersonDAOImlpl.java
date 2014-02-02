package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.app.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDAOImlpl implements PersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Person person) {
        em.persist(person);
    }

    @Override
    public Person getPersonById(int id) {
        return em.find(Person.class, id);
    }

    @Override
    public List<Person> getAllPerson() {
        return em.createQuery("from com.app.Person").getResultList();
    }
}
