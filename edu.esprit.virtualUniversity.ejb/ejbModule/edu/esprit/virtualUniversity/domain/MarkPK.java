package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MarkPK implements Serializable{
	
	private int examID;
	private int studentID;
	
	public int getExamID() {
		return examID;
	}
	public void setExamID(int examID) {
		this.examID = examID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examID;
		result = prime * result + studentID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkPK other = (MarkPK) obj;
		if (examID != other.examID)
			return false;
		if (studentID != other.studentID)
			return false;
		return true;
	}


}
