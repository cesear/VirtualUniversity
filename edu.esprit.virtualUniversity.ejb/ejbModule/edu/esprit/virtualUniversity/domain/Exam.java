package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="t_exam")
@Entity
public class Exam implements Serializable{
private int id;
private int coef;
private String name;
private Assignment assignment;
private List<Mark>marks;
@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCoef() {
	return coef;
}
public void setCoef(int coef) {
	this.coef = coef;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@ManyToOne(cascade=CascadeType.PERSIST)
public Assignment getAssignment() {
	return assignment;
}
public void setAssignment(Assignment assignment) {
	this.assignment = assignment;
}
@OneToMany(mappedBy="exam")
public List<Mark> getMarks() {
	return marks;
}
public void setMarks(List<Mark> marks) {
	this.marks = marks;
}

}
