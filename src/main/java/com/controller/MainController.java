package com.controller;

import com.DAO.daoImpl.PersonDAOImlpl;
import com.app.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private PersonDAOImlpl personDAOImlpl;

    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
    public String showMainPage(HashMap<String, Object> model) {
        model.put("personList", personDAOImlpl.getAllPerson());
        return "main";
    }

    @RequestMapping(value = {"/addPerson"}, method = RequestMethod.POST)
    public String addNewPerson(@RequestParam("personInitial") String initial,
                               @RequestParam("personTelephone") String telephone) {
        Person newPerson = new Person(initial, telephone);

        personDAOImlpl.insert(newPerson);
        return "redirect:/main";
    }

    @RequestMapping(value = {"/deletePerson"}, method = RequestMethod.POST)
    public String deletePerson(@RequestParam("deletePersonId") int personId) {
        personDAOImlpl.deleteById(personId);
        return "redirect:/main";
    }

    @RequestMapping(value = {"/searchPersons"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Person> searchPersons(@RequestParam("searchInitial") String initial) {
        List<Person> personList;
        if (initial.equals("")) {
            personList = personDAOImlpl.getAllPerson();
        } else {
            personList = personDAOImlpl.searchUsersByName(initial);
        }
        return personList;
    }

}