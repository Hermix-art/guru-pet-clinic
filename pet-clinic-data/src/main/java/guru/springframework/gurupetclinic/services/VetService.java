package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Vet;


/**
 * @author Herman Kulik
 */
public interface VetService extends CrudService<Vet, Long> { //all parent methods are defined here, but with defined types: Vet, Long

}
