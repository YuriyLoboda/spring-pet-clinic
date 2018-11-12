package yulo.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yulo.springframework.service.OwnerService;

/**
 * Created by yulo0717 on 10/30/2018.
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String getOwnersList(Model model){

        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
