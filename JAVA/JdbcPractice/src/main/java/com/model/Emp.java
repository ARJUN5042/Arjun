package com.model;

public class Emp 
{
	private int id;
	private String name,salary,desg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", desg=" + desg + "]";
	}
	public Emp(int id, String name, String salary, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
	}
	public Emp() {
	}
	
}
