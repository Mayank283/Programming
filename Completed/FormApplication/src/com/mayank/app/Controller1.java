package com.mayank.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

	@Autowired
	private UserDAOimpl userDao;
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration(Model model) {
		model.addAttribute("user", new User());
	    return new ModelAndView("Register");
	}
	
	
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView Done(@ModelAttribute User user) {
	    userDao.insert(user);
	    return new ModelAndView("Done");
	}
}