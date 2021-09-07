package com.devlomose.sfgpetclinic.bootstrap;

import com.devlomose.sfgpetclinic.model.*;
import com.devlomose.sfgpetclinic.services.OwnerService;
import com.devlomose.sfgpetclinic.services.PetTypeService;
import com.devlomose.sfgpetclinic.services.SpecialtyService;
import com.devlomose.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialtyService specialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        System.out.println("count = " + count);

        if(count == 0){
            this.loadData();
        }


    }

    private void loadData() {
        System.out.println("bootstrap init");

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Dog");
        PetType saveCatPetType = petTypeService.save(cat);

        System.out.println("PetTypes loaded...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedReadiology = specialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialitiesService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialitiesService.save(dentistry);

        System.out.println("Specialties loaded...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Jonathan");
        owner1.setLastName("Guzman");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("0123456789");

        Pet jonathanPet = new Pet();
        jonathanPet.setPetType(saveDogPetType);
        jonathanPet.setOwner(owner1);
        jonathanPet.setBirthDate(LocalDate.now());
        jonathanPet.setName("sasy");
        owner1.getPets().add(jonathanPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Antonio");
        owner2.setLastName("Guzman");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("9513578640");

        Pet antonioPet = new Pet();
        antonioPet.setPetType(saveCatPetType);
        antonioPet.setOwner(owner2);
        antonioPet.setBirthDate(LocalDate.now());
        antonioPet.setName("perrito");
        owner2.getPets().add(antonioPet);

        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Andres");
        vet1.setLastName("Hernandez");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Frida");
        vet2.setLastName("Hernandez");
        vet2.getSpecialities().add(dentistry);

        vetService.save(vet2);

        System.out.println("Vets loaded...");
    }
}
