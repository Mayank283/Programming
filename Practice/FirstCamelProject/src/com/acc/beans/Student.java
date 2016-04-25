package com.acc.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int rollNo;
	private String name;

	public Student() {
		super();
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student addPhraseOne(Student body) {
		System.out.println(body.getRollNo()+" : "+body.getName());
		Student s = null;
		try {
			s = (Student) body.clone();
			s.setRollNo(10);
			s.setName("Rakesh");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}

	public Student addPhraseTwo(Student body) {
		System.out.println(body.getRollNo()+" : "+body.getName());
		Student s = null;
		try {
			s = (Student) body.clone();
			s.setRollNo(20);
			s.setName("Kishora");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public Student addPhraseThree(Student body) {
		System.out.println(body.getRollNo()+" : "+body.getName());
		Student s = null;
		try {
			s = (Student) body.clone();
			s.setRollNo(20);
			s.setName("Kishora");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = new Student(this.rollNo, this.name);
		return s;
	}

	public Object deepClone() {
		Student s = new Student(this.rollNo, this.name);
		return s;
	}

}
