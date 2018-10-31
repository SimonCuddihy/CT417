package com.nuigalway.cuddihy.mavenproject;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {
	
	private String Name;
	private int Age;
	private DateTime DOB;
	private int ID;
	private String Username;
	
	
	public Student(String name, int age, DateTime dob, int id)
	{
		this.Name = name;
		this.Age = age;
		this.DOB = dob;
		this.ID = id;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public DateTime DOB() {
		return this.DOB;
	}

	public int ID() {
		return this.ID;
	}
	
	public String getUsername() {
		return Name + Age;
	}
	
	public String getStudent() {
		return this.Name + this.DOB + this.ID;
	}
	
	
	
}
