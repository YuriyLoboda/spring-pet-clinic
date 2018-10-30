package yulo.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yulo0717 on 10/30/2018.
 */
@Controller
public class VetsController {

    @RequestMapping({"","/vets","/vets/index","/vets/index.html"})
    public String getVetsList(){
        return "vets/index";
    }
}
