package com.app;

import com.DAO.DaoFactory;

public class Main {
    public static void main(String[] args) {
//        Person person = DaoFactory.INSTANCE.getPersonDAO().getPersonById(1);
//        List<Person> list = DaoFactory.INSTANCE.getPersonDAO().getAllPerson();
//        System.out.println(list);

          Person p = new Person("Igor", "undefinable");
          DaoFactory.INSTANCE.getPersonDAO().insert(p);

//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        Session session = factory.openSession();
//        session.beginTransaction();
//        Person persons = (Person) session.get(Person.class, 1);
//        System.out.println(persons.getPhoneNumber());
//        session.close();

    }
}
