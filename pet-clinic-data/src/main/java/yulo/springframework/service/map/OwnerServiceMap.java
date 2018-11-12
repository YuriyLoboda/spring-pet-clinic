package yulo.springframework.service.map;

import yulo.springframework.model.Owner;
import yulo.springframework.service.CrudService;
import yulo.springframework.service.OwnerService;

import java.util.Set;

/**
 * Created by yulo0717 on 10/29/2018.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner instance) {
        return super.save(instance.getId(), instance);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
