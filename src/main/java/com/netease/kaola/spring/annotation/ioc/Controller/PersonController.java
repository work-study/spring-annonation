package com.netease.kaola.spring.annotation.ioc.Controller;

import com.netease.kaola.spring.annotation.ioc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;
}
