package yulo.springframework.service;

import yulo.springframework.model.Owner;

import java.util.Set;

/**
 * Created by yulo0717 on 10/25/2018.
 */
public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
