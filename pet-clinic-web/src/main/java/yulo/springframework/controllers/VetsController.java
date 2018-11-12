package yulo.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yulo.springframework.service.VetService;

/**
 * Created by yulo0717 on 10/30/2018.
 */
@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/vets","/vets/index","/vets/index.html"})
    public String getVetsList(Model model){

        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
