package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="t_archive")
@Entity
public class Archive implements Serializable{
	
	private ArchivePK id;
	private Group group;
	private Student student;
	
	@EmbeddedId
	public ArchivePK getId() {
		return id;
	}
	public void setId(ArchivePK id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="groupID",referencedColumnName="id",insertable=false,updatable=false)
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="studentID",referencedColumnName="id",insertable=false,updatable=false)
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
