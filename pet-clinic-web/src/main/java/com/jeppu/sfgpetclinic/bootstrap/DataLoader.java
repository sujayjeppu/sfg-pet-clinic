package com.jeppu.sfgpetclinic.bootstrap;

import com.jeppu.sfgpetclinic.model.Owner;
import com.jeppu.sfgpetclinic.model.Vet;
import com.jeppu.sfgpetclinic.services.OwnerService;
import com.jeppu.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        //this.ownerService = new OwnerServiceMap();
        //this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        Owner newOwner1 = ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        Owner newOwner2 = ownerService.save(owner2);

        System.out.println("Loaded Owners...");
        System.out.println("Owners loaded - "+owner1+" , "+owner2);

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        Vet newVet1 = vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        Vet newVet2 = vetService.save(vet2);

        System.out.println("Loaded Vets...");
        System.out.println("Vets loaded - "+vet1+" , "+vet2);

    }
}
