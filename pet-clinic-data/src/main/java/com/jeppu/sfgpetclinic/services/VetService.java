package com.jeppu.sfgpetclinic.services;

import com.jeppu.sfgpetclinic.model.Owner;
import com.jeppu.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService{
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
