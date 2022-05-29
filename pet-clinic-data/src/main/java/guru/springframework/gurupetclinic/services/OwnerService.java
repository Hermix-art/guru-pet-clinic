package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Owner;

import java.util.Set;

/**
 * @author Herman Kulik
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
