package com.pro.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	//return to welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model)
	{/*
		 * //sending data to view(.jsp, .html) String myName="Priyanka";
		 * 
		 * //key= can be anything, value= is actaual data
		 * model.addAttribute("myNameValue", myName);
		 * model.addAttribute("myWebsiteTitle", "MOM'S CAFE123");
		 */
		return "welcome-page";
	}
	
	//return to process order page
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest req,Model model)
	{
		//handle data received from user
		String userEnteredValue=req.getParameter("foodType");
		
		//add captured data to model
		model.addAttribute("userInput", userEnteredValue);
		return "process-order";
	}
}
