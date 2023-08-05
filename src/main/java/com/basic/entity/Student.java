package com.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	int Id;
	@Column(name = "roll")
	int roll;
	@Column(name = "Std_ame")
	String name;
	@Column(name = "std_address")
	String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int roll, String name, String address) {
		super();
		Id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
