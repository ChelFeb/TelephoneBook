package com.controller;

import com.DAO.DaoFactory;
import com.app.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
    public String showMainPage(ModelMap model) {
        List<Person> personList = DaoFactory.INSTANCE.getPersonDAO().getAllPerson();
        model.put("personList", personList);
        return "main";
    }

    @RequestMapping(value = {"/addPerson"}, method = RequestMethod.POST)
    public String addNewPerson(@RequestParam("personInitial") String initial,
                               @RequestParam("personTelephone") String telephone) {
        Person newPerson = new Person(initial, telephone);
        DaoFactory.INSTANCE.getPersonDAO().insert(newPerson);
        return "redirect:/main";
    }

}