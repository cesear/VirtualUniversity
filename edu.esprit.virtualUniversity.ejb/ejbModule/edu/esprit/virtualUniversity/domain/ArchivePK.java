package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ArchivePK implements Serializable{

	private int academicYear;
	private int groupID;
	private int studentID;
	
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
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
		result = prime * result + academicYear;
		result = prime * result + groupID;
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
		ArchivePK other = (ArchivePK) obj;
		if (academicYear != other.academicYear)
			return false;
		if (groupID != other.groupID)
			return false;
		if (studentID != other.studentID)
			return false;
		return true;
	}
	
	


}
