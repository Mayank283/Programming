package com.mayank.MyResource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.rest.Names;
import com.mayank.rest.NamesService;

@RestController
@RequestMapping("/names")
public class MyResource {
	
	@RequestMapping(value = "/get", method=RequestMethod.GET)
	public List<Names> getLt() {
		return NamesService.getList();
	}

	@RequestMapping(value= "/post", method=RequestMethod.POST)
	public Names postIt(Names names) {
		return NamesService.postMethod(names);
	} 
}