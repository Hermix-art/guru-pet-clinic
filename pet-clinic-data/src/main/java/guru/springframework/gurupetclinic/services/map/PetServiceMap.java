package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Pet;
import guru.springframework.gurupetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
// class implements API, and extends it's implementation
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
