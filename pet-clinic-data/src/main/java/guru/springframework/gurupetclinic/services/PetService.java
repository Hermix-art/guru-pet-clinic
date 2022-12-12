package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Pet;


/**
 * @author Herman Kulik
 */
public interface PetService extends CrudService<Pet, Long> {//all parent methods are defined here, but with defined types: Pet, Long

}
