package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;
@Controller
public class ReController {
//1st method
//    @RequestMapping("/one")
//    public String one() {
//        System.out.println("this is one handler");
//        return "redirect:/enjoy";
//    }
 //2nd   
    @RequestMapping("/one")
    public RedirectView one() {
    	System.out.println("this is one handler");
    	RedirectView redirectView =new RedirectView();
    	redirectView.setUrl("enjoy");
    	return redirectView;
    }

    @RequestMapping("/enjoy")
    public String two() {
        System.out.println("this is second handler");
        
        return "contact";
    }
}