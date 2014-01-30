package com.DAO;

import com.DAO.daoImpl.PersonDAOImlp;
import com.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * Singleton
 */

public enum DaoFactory {

    INSTANCE;

    private PersonDAO personDAO;

    // created once
    private SessionFactory sessionFactory;

    DaoFactory() {
        sessionFactory = HibernateUtil.getSessionFactory();
        personDAO = new PersonDAOImlp(sessionFactory);
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }


}