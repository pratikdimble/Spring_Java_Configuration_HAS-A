package com.app.test;

public class Employee {
	private int id;
	private String name;
	private Address addr;
	
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}


}
