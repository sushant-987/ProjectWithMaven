package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Project {

@Id	
 private int  pid;

@Column(name="project-name")
 private String projectName;

 @ManyToMany(cascade=CascadeType.ALL)
 private List<Emp>emps;
 
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public List<Emp>getEmps() {
	return emps;
}
public void setEmps(List<Emp>emps) {
	this.emps = emps;
}
public Project(int pid, String projectName, List<Emp> emps) {
	super();
	this.pid = pid;
	this.projectName = projectName;
	this.emps = emps;
}
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
 
 

}
