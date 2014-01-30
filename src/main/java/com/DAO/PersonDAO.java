package com.DAO;

import com.app.Person;

public interface PersonDAO {
    public void insert(Person person);
    public Person getPersonById(int id);
}
