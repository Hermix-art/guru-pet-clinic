package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Pet;

/**
 * @author Herman Kulik
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> {
    @Override
    public Pet save(Pet value) {
        map.put(value.getId(), value);
        return value;
    }
}
