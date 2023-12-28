package com.model;

import java.util.Arrays;
import java.util.List;

public class User 
{
	private int id;
	private String name,address,mobile,gender,profilepic,email,password;
	private List<String> hobbies;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", gender="
				+ gender + ", profilepic=" + profilepic + ", email=" + email + ", password=" + password + ", hobbies="
				+ hobbies + "]";
	}
	public User(int id, String name, String address, String mobile, String gender, String profilepic, String email,
			String password, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.gender = gender;
		this.profilepic = profilepic;
		this.email = email;
		this.password = password;
		this.hobbies = hobbies;
	}
	public User() {
	}
	
			
}
