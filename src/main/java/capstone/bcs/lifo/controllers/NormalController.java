package capstone.bcs.lifo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

    @RequestMapping("/normal")
    public String getPage(){
        return "normal";
    }
}