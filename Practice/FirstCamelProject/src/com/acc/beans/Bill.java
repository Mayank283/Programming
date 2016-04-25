package com.acc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bill {
	private int id;
	private long price;
	private String location;
	private String status;

	
	public Bill() {
	}

	public Bill(int id, long price, String location, String status) {
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Bill updateStatus(Bill body) {
		System.out.println("UPDATE STATUS: "+body.getId()+" : "+body.getLocation()+" : "+body.getStatus());
		Bill bill = null;
		try {
			bill = (Bill) body.clone();
			bill.setStatus("Processed");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return bill;
	}
	
	public Bill checkLocation(Bill bill) {
		System.out.println(bill.toString());
		if (bill.getLocation().equalsIgnoreCase("US"))
			return bill;
		return bill;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Bill bill = new Bill(this.id, this.price, this.location, this.status);
		return bill;
	}

	public Object deepClone() {
		Bill bill = new Bill(this.id, this.price, this.location, this.status);
		return bill;
	}
	
	public static List<Bill> getBillList(){
		List<Bill> list = new ArrayList<>();
		list.add(new Bill(1, 2897, "IND", "Pending"));
		list.add(new Bill(2, 3450, "US", "Pending"));
		list.add(new Bill(3, 230, "IND", "Pending"));
		list.add(new Bill(4, 560, "UK", "Pending"));
		return list;
	}
	
	@Override
	public String toString() {
		return id+" : "+price+" : "+location+" : "+status;
	}
	
}
