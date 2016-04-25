package com.acc.wiretap.util;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

import com.acc.beans.Bill;

public class MyFilter implements Predicate {

	/**
	 * Filter out bills based on price
	 */
	
	@Override
	public boolean matches(Exchange exchange) {
		Bill bill = exchange.getIn().getBody(Bill.class);
		System.out.println(bill.toString());
		if (bill.getPrice() < 1000)
			return true;
		return false;
	}

}
