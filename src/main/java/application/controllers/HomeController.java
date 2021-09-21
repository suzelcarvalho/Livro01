package application.controllers;

import org.springframework.stereotype.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controllers
public class HomeControllers {
    @Requestmappping(method=RequetMethod.GET)
    public String index(){
        return "home/index.jsp"
    }

}
