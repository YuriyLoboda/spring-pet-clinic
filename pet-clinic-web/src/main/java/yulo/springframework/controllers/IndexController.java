package yulo.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yulo0717 on 10/30/2018.
 */
@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
