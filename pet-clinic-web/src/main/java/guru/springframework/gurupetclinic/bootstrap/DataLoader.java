package guru.springframework.gurupetclinic.bootstrap;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.model.Person;
import guru.springframework.gurupetclinic.model.Vet;
import guru.springframework.gurupetclinic.services.OwnerService;
import guru.springframework.gurupetclinic.services.VetService;
import guru.springframework.gurupetclinic.services.map.OwnerServiceMap;
import guru.springframework.gurupetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Herman Kulik
 */
@Component // to make it bean
public class DataLoader implements CommandLineRunner { // springboot specific way to initialize data
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {// when bean will be ready, this 'run' method will be executed
        // for now services are just saving to hashmap

        Owner owner1 = new Owner();
        owner1.setFirstName("Herman");
        owner1.setLastName("Smith");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        System.out.println("Owners are loaded...");
        System.out.println(ownerService.findAll());

        Vet vet1 = new Vet();
        vet1.setFirstName("John");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Bullock");

        vetService.save(vet2);

        System.out.println("Vets are loaded...");
        System.out.println(vetService.findAll());
    }
}
