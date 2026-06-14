package springmvcsearch;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class formController {

    @RequestMapping("/complex")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "complex_form";
    }

    @RequestMapping(value = "/handleform", method = RequestMethod.POST)
    public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "complex_form";
        }
        System.out.println(student);
        return "success";
    }
}