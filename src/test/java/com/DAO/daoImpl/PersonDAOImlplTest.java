package com.DAO.daoImpl;

import com.DAO.PersonDAO;
import com.IntegrationTest;
import com.app.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonDAOImlplTest extends IntegrationTest {
    @Autowired
    private PersonDAO personDAO;

    @Before
    public void setUpClass() {
        initializeData();
    }

    @Test
    public void createPerson() {

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
    }

}
