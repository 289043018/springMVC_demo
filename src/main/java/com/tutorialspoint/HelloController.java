package com.tutorialspoint;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/hello")
public class HelloController{ 
	@RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model,HttpServletRequest request) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
}