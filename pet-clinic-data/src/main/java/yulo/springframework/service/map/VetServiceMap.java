package yulo.springframework.service.map;

import yulo.springframework.model.Vet;
import yulo.springframework.service.CrudService;
import yulo.springframework.service.VetService;

import java.util.Set;

/**
 * Created by yulo0717 on 10/29/2018.
 */
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findByID(id) ;
    }

    @Override
    public Vet save(Vet instance) {
        return super.save(instance.getId(),instance);
    }
    @Override
    public void deleteByID(Long id){
        super.deleteByID(id);
    }
    @Override
    public void delete(Vet vet){
        super.delete(vet);
    }
    @Override
    public Set<Vet> findAll(){
        return super.findAll();
    }
}
