package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.IntegrationTest;
import com.app.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonDAOImlplTest extends IntegrationTest {
    @Autowired
    private PersonDAO personDAO;

    @Before
    public void setUpClass() {
        initializeData();
    }

    @Test
    public void createPerson() {
        final Person newPerson = new Person("Anton", "091");
        personDAO.insert(newPerson);
        assertEquals(3, personDAO.getAllPerson().size());
    }

    @Test
    public void getPersonByIdTest() {
        final Person person = personDAO.getPersonById(1);
        assertEquals("Tests", person.getInitials());
        assertEquals("1234", person.getPhoneNumber());
    }

    @Test
    public void getAllPersonTest() {
        final List<Person> personList = personDAO.getAllPerson();
        assertEquals(2, personList.size());
        assertEquals("Test", personList.get(0).getInitials());
    }

    @Test
    public void deleteByIdTest() {
        final Person person = personDAO.getPersonById(2);
        assertEquals("Test1", person.getInitials());
        personDAO.deleteById(2);
        assertNull(personDAO.getPersonById(2));
    }

}
