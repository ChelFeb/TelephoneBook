package com.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {

    @InjectMocks
    private MainControllerTest mainController;

    @Mock
    private Model model;

    @Test
    public void testShowMainPage() throws Exception {


    }

    @Test
    public void testAddNewPerson() throws Exception {

    }
}
