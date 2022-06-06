package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Owner;

/**
 * @author Herman Kulik
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {
    @Override
    public Owner save(Owner value) {
        map.put(value.getId(), value);
        return value;
    }
}
