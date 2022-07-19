package com.stg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import lombok.NoArgsConstructor;

@Entity
@Table(name="dept_tbl")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	@Column(name="departmentname",length=20)
	private String deptName;
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "department")
	private List<Employee> employees; //one to many
	public Department() {
		super();
	}
	public Department(int deptId, String deptName, List<Employee> employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employees = employees;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
