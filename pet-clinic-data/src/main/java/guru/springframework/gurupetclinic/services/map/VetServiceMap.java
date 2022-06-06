package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Vet;

/**
 * @author Herman Kulik
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> {
    @Override
    public Vet save(Vet value) {
        map.put(value.getId(), value);
        return value;
    }
}
