package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.services.OwnerService;
import org.springframework.stereotype.Component;

/**
 * @author Herman Kulik
 */
@Component
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner value) { // implementation here, rest of OwnerService(CrudeService) implementations are in AbstracMapService
        map.put(value.getId(), value);
        return value;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
