package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.services.OwnerService;

/**
 * @author Herman Kulik
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner value) {
        map.put(value.getId(), value);
        return value;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
