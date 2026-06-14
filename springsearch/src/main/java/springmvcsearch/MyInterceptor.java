package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.*;
//import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
	                         HttpServletResponse response,
	                         Object handler) throws Exception {

	    System.out.println("Pre Handle - before controller");

	    String name = request.getParameter("querybox");

	    // Null check pehle!
	    if(name != null && name.startsWith("d")) {
	        response.setContentType("text/html");
	        response.getWriter().println("Invalid name");
	        return false;
	    }

	    return true;
	}

    @Override
    public void postHandle(HttpServletRequest request, 
                           HttpServletResponse response, 
                           Object handler, 
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handle - after controller");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, 
                                HttpServletResponse response, 
                                Object handler, 
                                Exception ex) throws Exception {
        System.out.println("After Completion - view rendered");
    }
}