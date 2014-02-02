package com.controller;

import com.DAO.daoImpl.PersonDAOImlpl;
import com.app.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PersonDAOImlpl personDAOImlpl;

    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
    public String showMainPage(ModelMap model) {
        model.put("personList", personDAOImlpl.getAllPerson());
        return "main";
    }

    @RequestMapping(value = {"/addPerson"}, method = RequestMethod.POST)
    public String addNewPerson(@RequestParam("personInitial") String initial,
                               @RequestParam("personTelephone") String telephone) {
        personDAOImlpl.insert(new Person(initial, telephone));
        return "redirect:/main";
    }

}