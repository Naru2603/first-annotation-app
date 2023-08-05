package com.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeMerge {

	@Id
	@Column(name = "Id")
	int Id;
	@Column(name = "empId")
	int empId;
	@Column(name = "empName")
	String name;
	@Column(name = "empAddress")
	String address;
	@Column(name = "empDpt")
	String department;

	public EmployeeMerge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeMerge(int id, int empId, String name, String address, String department) {
		Id = id;
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empId=" + empId + ", name=" + name + ", address=" + address + ", department="
				+ department + "]";
	}

}
