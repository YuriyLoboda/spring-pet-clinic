package yulo.springframework.service.map;

import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yulo0717 on 10/29/2018.
 */
public abstract class AbstractMapService<T, ID>{
    private Map<ID, T> mapStracture = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<T>(mapStracture.values());
    }

    public T findByID(ID id) {
        return mapStracture.get(id);
    }

    public T save(ID id, T object) {
        mapStracture.put(id,object);
        return object;
    }
    public void deleteByID(ID id){
        mapStracture.remove(id);
    }
    public void delete(T object){
        mapStracture.remove(object);
    }
}
