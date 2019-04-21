package capstone.bcs.lifo.controllers;


import capstone.bcs.lifo.commands.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String getPage(Model model){
        model.addAttribute("LoginForm", new LoginForm());
        return "contact";
    }

    @RequestMapping("/contact/{id}")
    public String getPageVar(HttpServletRequest request, @PathVariable("id") Integer id, Model model) {
        model.addAttribute("LoginForm", new LoginForm());
        return "redirect:" + "/contact";
    }

}
