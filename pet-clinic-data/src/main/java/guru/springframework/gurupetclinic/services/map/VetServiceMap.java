package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Vet;
import guru.springframework.gurupetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
// class implements API, and extends it's implementation
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

}
