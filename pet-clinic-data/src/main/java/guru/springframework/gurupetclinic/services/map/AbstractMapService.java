package guru.springframework.gurupetclinic.services.map;

import guru.springframework.gurupetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Herman Kulik
 */
public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public abstract T save(T value);

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

}
