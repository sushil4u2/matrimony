package com.matrimony.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;

@Entity(name="Matrimony_Profile")
@NamedQuery(name = "findPeopleByGender", query = "from Matrimony_Profile g where g.gender like:gndr")
public class Profile {
	String name;
	String gender;
	@Id
	long mobileNo;
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	int age;
	int salary;
	String motherTounge;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getMotherTounge() {
		return motherTounge;
	}
	public void setMotherTounge(String motherTounge) {
		this.motherTounge = motherTounge;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", gender=" + gender + ", mobileNo=" + mobileNo + ", age=" + age + ", salary="
				+ salary + ", motherTounge=" + motherTounge + "]";
	}
	
	
	
}
