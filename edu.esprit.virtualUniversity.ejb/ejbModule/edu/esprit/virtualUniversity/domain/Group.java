package edu.esprit.virtualUniversity.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="t_group")
@Entity
public class Group implements Serializable{

	private int id;
	private String name;
	private List<Archive>archives;
	private List<Assignment>assignments;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToMany(mappedBy="group")
	public List<Archive> getArchives() {
		return archives;
	}
	public void setArchives(List<Archive> archives) {
		this.archives = archives;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="group")
	public List<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	
	
}
