package com.controller;

import com.DAO.daoImpl.PersonDAOImlpl;
import com.app.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyList;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {

    @InjectMocks
    private MainController mainController;

    @Mock
    private PersonDAOImlpl personDAOImlpl;

    @Mock
    private HashMap<String, Object> model;

    @Mock
    private Person person;

    @Test
    public void testShowMainPage() throws Exception {
        assertEquals("main", mainController.showMainPage(model));
        verify(model).put(eq("personList"), anyList());
    }

    @Test
    public void testAddNewPerson() throws Exception {
        String initials = "test";
        String phone = "001";
        assertEquals("redirect:/main", mainController.addNewPerson(initials, phone));
    }

    @Test
    public void testDeletePerson() throws Exception {
        mainController.deletePerson(1);
        verify(personDAOImlpl).deleteById(1);

    }

    @Test
    public void testNoSearchPersons() throws Exception {
        mainController.searchPersons("");
        verify(personDAOImlpl).getAllPerson();
    }

    @Test
    public void testSearchPersons() {
        mainController.searchPersons("Test");
        verify(personDAOImlpl).searchUsersByName("Test");
    }
}
