package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
@Id
@Column
private int answer_Id;
private String answer;

@ManyToOne
private Question question;

/**
 * @return the answer_Id
 */
public int getAnswer_Id() {
	return answer_Id;
}
/**
 * @param answer_Id the answer_Id to set
 */
public void setAnswer_Id(int answer_Id) {
	this.answer_Id = answer_Id;
}
/**
 * @return the answer
 */
public String getAnswer() {
	return answer;
}
/**
 * @param answer the answer to set
 */
public void setAnswer(String answer) {
	this.answer = answer;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer(int answer_Id, String answer) {
	super();
	this.answer_Id = answer_Id;
	this.answer = answer;
}

}
