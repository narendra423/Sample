package com.stg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int empId;
	@Column(name="employeename",length=25)
	private String empName;
	private float salary;
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="deptId",nullable = false)
	@JsonBackReference
	private Department department; //Bidirection

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, float salary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
