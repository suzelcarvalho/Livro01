package application.controllers;

import org.springframework.stereotype.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@controllers
public class HomeControllers {
    @Requestmappping(method=RequetMethod.GET)
    public String index(){
        return "home/index.jsp"
    }

}
