package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Vet;
import guru.springframework.gurupetclinic.services.VetService;

/**
 * @author Herman Kulik
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet value) {
        map.put(value.getId(), value);
        return value;
    }
}
