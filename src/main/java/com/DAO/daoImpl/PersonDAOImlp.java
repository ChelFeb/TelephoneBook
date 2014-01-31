package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.app.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonDAOImlp implements PersonDAO {

    private SessionFactory sessionFactory;

    public PersonDAOImlp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insert(Person person) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Person getPersonById(int id) {
        Session session = sessionFactory.openSession();
        Person person = (Person) session.get(Person.class, id);
        session.close();
        return person;
    }

    @Override
    public List<Person> getAllPerson() {
        Session session = sessionFactory.openSession();
        List<Person> list = session.createCriteria(Person.class).list();
        session.close();
        return list;
    }


}
