package skypro.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skypro")
public class SpringMVCController {

    @RequestMapping("/1")
    public String getFirstView(){
        return "view1";
    }

    @RequestMapping("/enterInfo")
    public String enterInfo(){
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(){
        return "showInfo";
    }

}
