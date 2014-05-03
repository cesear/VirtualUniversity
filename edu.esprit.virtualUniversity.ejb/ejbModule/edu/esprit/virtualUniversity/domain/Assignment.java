package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="t_assignment")
@Entity
public class Assignment implements Serializable {

	private int id;
	private Subject subject;
	private Teacher teacher;
	private Group group;
	private List<Exam> exams;
	private Course course;
	private int year;

	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	@OneToMany(mappedBy="assignment")
	public List<Exam> getExams() {
		return exams;
	}
	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
