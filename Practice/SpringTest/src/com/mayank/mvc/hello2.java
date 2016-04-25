package com.mayank.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.*;

public class hello2 extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv=new ModelAndView("Two");
		mv.addObject("checktwo","Hi User");
		return mv;
	}
}