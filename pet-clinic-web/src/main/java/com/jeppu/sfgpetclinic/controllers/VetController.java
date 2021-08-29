package com.jeppu.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "vets")
public class VetController {
    @RequestMapping(value={"", "/", "/index", "/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
