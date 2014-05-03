package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="t_mark")
@Entity
public class Mark implements Serializable{
	
	private MarkPK id;
	private Exam exam;
	private Student student;
	private int value;
	
	@Id
	public MarkPK getId() {
		return id;
	}
	public void setId(MarkPK id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="examID",referencedColumnName="id",insertable=false,updatable=false)
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="studentID",referencedColumnName="id",insertable=false,updatable=false)
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
