package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.User;

import org.springframework.web.bind.annotation.*;
import com.springmvc.service.*;
import com.springmvc.service.UserService;
@Controller
public class ContactController {
	 @Autowired
	    private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","LearnCodeWith Durgesh");
		m.addAttribute("Desc","DHome for programmer");
	}

    @RequestMapping("/contact")
    public String showForm(Model m) {
    	
        return "contact";
    }
    /*
    @RequestMapping(path="/processform",method=RequestMethod.POST)
    public String handleForm(@RequestParam("name") String userName,@RequestParam("email") String userEmail,@RequestParam("password") String userPassword,Model model) {//String email me value ayegi
    	
//    System.out.println("userEmail"+userEmail);
//    System.out.println("userName"+userName);
//    System.out.println("userPassword"+userPassword);
    	User user=new User();
    	user.setEmail(userEmail);
    	user.setName(userName);
    	user.setPassword(userPassword);
    	
//    model.addAttribute("name",userName);
//    model.addAttribute("email",userEmail);
//    model.addAttribute("password",userPassword);
    	model.addAttribute("user",user);
    return "Success";
    }
} */
    
    
@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@ModelAttribute User user) {
	System.out.println(user);
	if(user.getName().isBlank()) {
		
		return "redirect:/contact";
	}
	 userService.createUser(user);

        	

        return "Success";
        }
    } 