package yulo.springframework.service;

import java.util.Set;

/**
 * Created by yulo0717 on 10/29/2018.
 */
public interface CrudService<T,ID> {
    T findById(Long id);
    T save(T instance);
    Set<T> findAll();
}
