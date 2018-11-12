package yulo.springframework.service.map;

import org.springframework.stereotype.Service;
import yulo.springframework.model.Pet;
import yulo.springframework.service.CrudService;
import yulo.springframework.service.PetService;

import java.util.Set;

/**
 * Created by yulo0717 on 10/29/2018.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet instance) {
        return super.save(instance);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
