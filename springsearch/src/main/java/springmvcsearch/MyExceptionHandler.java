package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class MyExceptionHandler {
	 @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(value=NullPointerException.class)
	    public String exceptionHandlerNull(Model m) {
		 m.addAttribute("msg","null exception");
	        return "null_page";
	    }
	 @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	 @ExceptionHandler(value=NumberFormatException.class)
	 public String exceptionHandlerNumber(Model m) {
		 m.addAttribute("msg","number wrong format");
		 return "null_page";
	 }
	 @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(value=Exception.class)
	        public String exceptionsHandle(Model m) {
	        	m.addAttribute("msg","exception occured");
	        
	        	return "null_page";
	        	
	    }
}
