package yulo.springframework.service;

import yulo.springframework.model.Pet;
import yulo.springframework.model.Vet;

import java.util.Set;

/**
 * Created by yulo0717 on 10/25/2018.
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
