package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.model.BaseEntity;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Herman Kulik
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object is null");
        }
        return object;
    }

    private Long getNextId() {
        // wybiera najwiekszy z kluczy i zwraca jego wartosc zainkrementowana o 1
        return map.isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

}
