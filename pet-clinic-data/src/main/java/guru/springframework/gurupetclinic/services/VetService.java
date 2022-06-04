package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.model.Vet;

import java.util.Set;

/**
 * @author Herman Kulik
 */
public interface VetService extends CrudService<Vet, Long> { //all parent methods are defined here, but with defined types: Vet, Long

}
