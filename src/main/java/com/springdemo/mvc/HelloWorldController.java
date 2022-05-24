package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    //controller to request the form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld-form";
    }

    //controller to process the form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }
    @RequestMapping("/processformv2")
    public String upper(HttpServletRequest request, Model model){
        //read the request parameter
        String theName = request.getParameter("studentname");

        //convert data
        theName=theName.toUpperCase();
        //create a message
        String result = "hey! hi, "+ theName;

        //add a message to model
        model.addAttribute("message",result);

        return "helloWorld";
    }
    @RequestMapping("/processFormv3")
    public String processformv3(@RequestParam("studentname") String theName ,Model  model) {
        //read the request parameter

        //String theName = request.getParameter("studentname");

        //convert data
        theName = theName.toUpperCase();
        //create a message
        String result = "hey! my friend from v3 , " + theName;

        //add a message to model
        model.addAttribute("message", result);
        return "helloWorld";
    }
}
