package com.robmcarrier.budgetapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String get() {
        return "hi";
    }
}
