package com.imlabs.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class StudentMysql {
	@Id
	@GeneratedValue
	private long studentId;
	private String studentName;
	
	
	
	
	public long getStudentId() {
		return studentId;
	}




	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public StudentMysql() {
		super();
	}
	
}
