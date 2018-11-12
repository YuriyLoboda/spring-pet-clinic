package yulo.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import yulo.springframework.model.Owner;
import yulo.springframework.model.Vet;
import yulo.springframework.service.OwnerService;
import yulo.springframework.service.VetService;
import yulo.springframework.service.map.OwnerServiceMap;
import yulo.springframework.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    DataLoader(){
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner bigBoss = new Owner();
        bigBoss.setId(1L);
        bigBoss.setLastName("L");
        bigBoss.setName("Y");
        ownerService.save(bigBoss);

        Owner smallBoss = new Owner();
        smallBoss.setId(2L);
        smallBoss.setName("L");
        smallBoss.setLastName("L");
        ownerService.save(smallBoss);
        System.out.println("owners are loading");
        Vet goodVet = new Vet();
        goodVet.setId(1L);
        goodVet.setLastName("Mama");
        goodVet.setName("Leva");
        vetService.save(goodVet);

        Vet badVet = new Vet();
        badVet.setId(2L);
        badVet.setName("Lega");
        badVet.setLastName("Gavrik");
        vetService.save(badVet);
    }
}
