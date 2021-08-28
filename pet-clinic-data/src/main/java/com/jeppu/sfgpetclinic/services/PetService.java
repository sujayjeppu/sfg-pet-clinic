package com.jeppu.sfgpetclinic.services;

import com.jeppu.sfgpetclinic.model.Owner;
import com.jeppu.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService{
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
