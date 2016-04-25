package com.mayank.rest;

import java.util.ArrayList;
import java.util.List;

public class NamesService {
	
	static List<Names> list = new ArrayList<>();

	public static Names postMethod(Names names){
		list.add(names);
		return names;
	}	

	public static List<Names> getList(){
		return list;
	}	
}