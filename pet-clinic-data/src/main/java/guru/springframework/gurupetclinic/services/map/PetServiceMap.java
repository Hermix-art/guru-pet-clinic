package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Pet;
import guru.springframework.gurupetclinic.services.PetService;

/**
 * @author Herman Kulik
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet value) {
        map.put(value.getId(), value);
        return value;
    }
}
