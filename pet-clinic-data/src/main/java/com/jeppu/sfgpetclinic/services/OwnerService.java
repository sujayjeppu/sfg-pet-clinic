package com.jeppu.sfgpetclinic.services;

import com.jeppu.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
