package com.map;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Emp {

@Id	
 private int eid;
 private String ename;

 
 public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
 
 
}
