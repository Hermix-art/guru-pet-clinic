package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Owner;

/**
 * @author Herman Kulik
 */
public interface OwnerService extends CrudService<Owner, Long> {//all parent methods are defined here, but with defined types: Owner, Long
    Owner findByLastName(String lastName);
}
