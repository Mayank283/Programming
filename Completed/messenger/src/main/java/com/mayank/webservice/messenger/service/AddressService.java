package com.mayank.webservice.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mayank.webservice.messenger.model.Address;


public class AddressService {

	static Map<String,Address> addressmap=new HashMap<>();

	public static Address addAddress(int id, String type,Address address) {

		address.setType(type);
		addressmap.put(type,address);
		
		NamesService.mapping.get(id).setAddressmap(addressmap);

		return address;
	}

	public static List<Address> getAddress(int id) {
		
		return new ArrayList<Address>(NamesService.mapping.get(id).getAddressmap().values());
		
	}
}