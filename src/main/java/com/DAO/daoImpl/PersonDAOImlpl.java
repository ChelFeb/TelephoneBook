package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.app.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDAOImlpl implements PersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Person person) {
        em.persist(person);
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return em.find(Person.class, id);
    }

    @Override
    @Transactional
    public List<Person> getAllPerson() {
        return em.createQuery("from com.app.Person").getResultList();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        em.remove(em.find(Person.class, id));
    }

    @Override
    public List<Person> searchUsersByName(String name) {
        return em.createQuery("SELECT p FROM com.app.Person p WHERE p.initials LIKE :searchSymbol")
                .setParameter("searchSymbol", "%"+name+"%").getResultList();
    }
}
