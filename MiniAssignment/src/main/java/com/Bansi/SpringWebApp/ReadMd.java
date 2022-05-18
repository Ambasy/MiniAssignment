package com.Bansi.SpringWebApp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;

public class ReadMd {

}


/**
 * 
 * @author Satty
 * @Controller annotation will let the spring know that this is the controller
 *             code which will call home.jsp page. @RequestMapping will let the
 *             function know that request is for home.jsp file. For, hello
 *             function to return home.jsp file content we will have to include
 *             tomcat-jasper dependency.
 *             
 * req.setAttribute("name", name); // to set attribute to the jsp and servlet,
 * so that it becomes global or we can use session obj.
 * 
 * If you want to treat a req parameter to some other name then we can use Annotation @RequestParam("name")
 * 	public String home(@RequestParam("name") String myName, HttpServletRequest req) {
 * this will behave like, if someone myName will be taken in request parameter as name.
 * 
 * Why do we need Session object, we need this to store our request obj and its value, basically our dispatcher 
 * servlet need 2 things, data and view name, what if we give these 2 with another class obj, i.e. ModelAndView
 * class.
 * 
 * Instead of a single variable sending as request parameter, we can also send a jave obj in it.

 */