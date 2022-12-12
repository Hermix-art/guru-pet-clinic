package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.Owner;
import guru.springframework.gurupetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * @author Herman Kulik
 */
// class implements API, and extends it's implementation
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
