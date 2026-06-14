package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/first")
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
    	model.addAttribute("name","Durgesh Tiwari");
    	model.addAttribute("id",1421);
    	List<String> friends = new ArrayList<String>();
    	friends.add("Vandan");
    	friends.add("Roshini");
    	friends.add("ABC");
    	model.addAttribute("f",friends);
        return "index";
    }
    @RequestMapping("/about")
    public String about() {
    	System.out.println("hi");
    	return "about";
    }
    @RequestMapping("/help")
    public ModelAndView help() {
    	ModelAndView modelAndView =new ModelAndView();
    	modelAndView.addObject("name","Uttam");
    	modelAndView.setViewName("help");
    	LocalDateTime now=LocalDateTime.now();
    	modelAndView.addObject("time",now);
    	return modelAndView;
    }
}