package guru.springframework.gurupetclinic.services;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.model.Vet;

import java.util.Set;

/**
 * @author Herman Kulik
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
