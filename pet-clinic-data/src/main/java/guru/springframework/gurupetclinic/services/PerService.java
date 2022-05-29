package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.model.Pet;

import java.util.Set;

/**
 * @author Herman Kulik
 */
public interface PerService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
