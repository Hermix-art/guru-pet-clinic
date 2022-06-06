package guru.springframework.gurupetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Herman Kulik
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"}) // all these parameters means that pages: /, /, /index, /index.html will lead you to the page with "index" view
    public String index() {
        return "index";
    }

}
