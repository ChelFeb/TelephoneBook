package com.DAO;

import com.app.Person;

import java.util.List;

public interface PersonDAO {
    public void insert(Person person);
    public Person getPersonById(int id);
    public List<Person> getAllPerson();
    public void deleteById(int id);
}
