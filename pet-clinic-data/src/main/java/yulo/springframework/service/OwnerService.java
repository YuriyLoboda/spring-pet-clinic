package yulo.springframework.service;

import yulo.springframework.model.Owner;

/**
 * Created by yulo0717 on 10/25/2018.
 */
public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
