package com.jeppu.sfgpetclinic.model;

public class Owner extends Person{
    @Override
    public String toString() {
        return "Owner{ ID : "+super.getId()+" - First Name : "+super.getFirstName()+" - Last Name : "+super.getLastName()+"}";
    }
}
