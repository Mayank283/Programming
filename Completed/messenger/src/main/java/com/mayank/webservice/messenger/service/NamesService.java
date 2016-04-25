package com.mayank.webservice.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mayank.webservice.messenger.exception.DataNotFoundException;
import com.mayank.webservice.messenger.model.Names;

public class NamesService {

	public static Map<Integer,Names> mapping=new HashMap<>();	
	
	public static Names addNames(Names names){
	
		names.setId(mapping.size()+1);
		mapping.put(names.getId(),names);
		return names;
}

	public static List<Names> getallNames(){
		return new ArrayList<Names>(mapping.values());

	}

	public static Names getNameByid(int id) throws DataNotFoundException {
		if(mapping.get(id)==null)
		{
			throw new DataNotFoundException("No Data with id "+id+" Exist");
		}
		
		return mapping.get(id);
	}
}