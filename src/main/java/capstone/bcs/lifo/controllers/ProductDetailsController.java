package capstone.bcs.lifo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductDetailsController {

    @RequestMapping("/products")
    public String getPage(){
        return "products";
    }
}
