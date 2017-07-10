package com.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Shreya on 7/9/2017.
 */
@Controller
public class StudentController extends MultiActionController
 {

   @RequestMapping(value = "/index.html", method = RequestMethod.GET)
   public String printWelcome(ModelMap model) {

       model.addAttribute("message", "HELLO WORLD");
       return "index";

   }

     @RequestMapping(value = "/index/{firstname}/{lastname}", method = RequestMethod.GET)
     public ModelAndView hello(@PathVariable("firstname") String firstname,
                               @PathVariable("lastname") String lastname) {
         System.out.println(firstname);
         System.out.println(lastname);
         ModelAndView model = new ModelAndView();
         model.setViewName("index");
         model.addObject("msg1", firstname);
         model.addObject("msg2", lastname);
         return model;
     }

}
