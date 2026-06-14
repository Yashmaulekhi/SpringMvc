package springmvcsearch;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.servlet.view.RedirectView;
//
//@Controller
//public class SearchController {

//    @RequestMapping("/user/{userId}")
//    public String getUser(@PathVariable("userId") int userId) {
//        System.out.println("hi" + userId);
//        return "home";
//    
//
//    @RequestMapping("/home")
//    public String home() {
//        String str = null;
//        System.out.println(str.length());
//        return "home";
//    }

//    @RequestMapping("/search")
//    public RedirectView search(@RequestParam("querybox") String query) {
//        RedirectView redirectView = new RedirectView();
//        if (query.isBlank()) {
//            redirectView.setUrl("home");
//        } else {
//            String url = "https://www.google.com/search?q=" + query;
//            redirectView.setUrl(url);
//        }
//        return redirectView;
  //  }
//    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//    public String exceptionHandlerNull() {
//        return "null_page";
//    }
//    @ExceptionHandler(value=Exception.class)
//        public String exceptionsHandle(Model m) {
//        	m.addAttribute("msg","exception occured");
//        
//        	return "null_page";
//        	
//}
