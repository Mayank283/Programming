package com.mayank.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.*;

public class hello extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv=new ModelAndView("Hellopage");

		mv.addObject("welcomeMessage","Hi User");
		return mv;
	}
}