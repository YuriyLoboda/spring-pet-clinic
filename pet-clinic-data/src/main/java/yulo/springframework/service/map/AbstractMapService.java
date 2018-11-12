package yulo.springframework.service.map;

import org.springframework.data.repository.CrudRepository;
import yulo.springframework.model.BaseEntity;

import java.util.*;

/**
 * Created by yulo0717 on 10/29/2018.
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>{
    private Map<Long, T> mapStracture = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<T>(mapStracture.values());
    }

    public T findByID(ID id) {
        return mapStracture.get(id);
    }

    public T save(T object) {
        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextID());
            }
        }
        mapStracture.put(object.getId(),object);
        return object;
    }
    public void deleteByID(ID id){
        mapStracture.remove(id);
    }
    public void delete(T object){
        mapStracture.remove(object);
    }

    private Long getNextID(){
        Long nextID = null;
        try {
            nextID = Collections.max(mapStracture.keySet()) + 1;
        }catch (NoSuchElementException ex){
            nextID = 1L;
        }
        return nextID;
    }
}
