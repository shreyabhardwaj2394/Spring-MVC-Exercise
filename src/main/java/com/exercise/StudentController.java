package com.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

public class StudentController {


    //Hit submit.jsp

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(User user) {
        return "FirstName " + user.getFirstName() + " LastName " + user.getLastName();
    }


}
