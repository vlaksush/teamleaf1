package com.suresh.demos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abc")
public class HomeController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("home");
		model.addObject("org","ABC Technologies");
		return model;
	}
	
	
}
