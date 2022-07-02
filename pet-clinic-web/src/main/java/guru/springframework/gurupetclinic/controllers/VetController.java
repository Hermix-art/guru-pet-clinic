package guru.springframework.gurupetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Herman Kulik
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"}) // endpoints are mapped to the method
    public String listVets() {
        return "vets/index";
    }
}
