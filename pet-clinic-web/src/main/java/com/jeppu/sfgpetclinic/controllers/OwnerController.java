package com.jeppu.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="owner")
public class OwnerController {
    @RequestMapping(value={"", "/", "/index", "/index.html"})
    public String listOwners(){
        return "owner/index";
    }
}
