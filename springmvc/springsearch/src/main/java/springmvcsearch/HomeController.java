package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class HomeController {
	 @RequestMapping("/home")
	    public String home() {
	       // String str = null;
	        System.out.println("This is a Handler");
	        return "home";
	    }
	 @RequestMapping("/welcome")
	 public String search(@RequestParam(value = "query", required = false) String name, Model m) {
	     if (name != null) {
	         System.out.println(name);
	         m.addAttribute("name", name);
	     }
	     return "welcome";
	 }
}
