package com.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Shreya on 7/9/2017.
 */
@Controller
public class StudentController
 {

     @RequestMapping(value = "/index.html", method = RequestMethod.GET)
     public String printWelcome(ModelMap model) {
         model.addAttribute("message", "HELLO WORLD FROM JSP");
         return "index";

     }


}
