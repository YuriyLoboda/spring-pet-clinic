package yulo.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import yulo.springframework.model.Owner;
import yulo.springframework.model.Vet;
import yulo.springframework.service.OwnerService;
import yulo.springframework.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner bigBoss = new Owner();
        bigBoss.setLastName("L");
        bigBoss.setName("Y");
        ownerService.save(bigBoss);

        Owner smallBoss = new Owner();
        smallBoss.setName("L");
        smallBoss.setLastName("L");
        ownerService.save(smallBoss);
        System.out.println("owners are loading");
        Vet goodVet = new Vet();
        goodVet.setLastName("Mama");
        goodVet.setName("Leva");
        vetService.save(goodVet);

        Vet badVet = new Vet();
        badVet.setName("Lega");
        badVet.setLastName("Gavrik");
        vetService.save(badVet);
    }
}
