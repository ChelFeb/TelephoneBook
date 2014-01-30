package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.app.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonDAOImlp implements PersonDAO {

    private SessionFactory sessionFactory;

    public PersonDAOImlp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insert(Person person) {

    }

    @Override
    public Person getPersonById(int id) {
        Session session = sessionFactory.openSession();
        Person person = (Person) session.get(Person.class, id);
        session.close();
        return person;
    }
}
