package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Pet;
import guru.springframework.gurupetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet value) {
        map.put(value.getId(), value);
        return value;
    }
}
