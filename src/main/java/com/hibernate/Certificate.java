 package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
private String Course;
private String Duration;
/**
 * @return the course
 */
public String getCourse() {
	return Course;
}
/**
 * @param course the course to set
 */
public void setCourse(String course) {
	Course = course;
}
/**
 * @return the duration
 */
public String getDuration() {
	return Duration;
}
/**
 * @param duration the duration to set
 */
public void setDuration(String duration) {
	Duration = duration;
}
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}
public Certificate(String course, String duration) {
	super();
	Course = course;
	Duration = duration;
}



}
