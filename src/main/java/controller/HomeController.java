package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/buscaminas", method = RequestMethod.GET )
    @ResponseBody
    public String paginaPrincial() {
        return "hola mundo";
    }
}
