package vn.thaitv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column(name = "id")
	private int studentID;
	@Column(name = "name")
	private String studentName;
	@Column(name = "age")
	private int studentAge;

	public Person() {
	
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Person(int studentID, String studentName, int studentAge) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
}
