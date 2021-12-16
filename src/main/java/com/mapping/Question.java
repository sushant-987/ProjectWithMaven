package com.mapping;

import java.nio.MappedByteBuffer;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
@Id
@Column(name = "question_id")
private int questionId;
private String question;


@OneToMany(mappedBy = "question")
private List<Answer>answers;
/**
 * @return the questionId
 */
public int getQuestionId() {
	return questionId;
}
/**
 * @param questionId the questionId to set
 */
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
/**
 * @return the question
 */
public String getQuestion() {
	return question;
}
/**
 * @param question the question to set
 */
public void setQuestion(String question) {
	this.question = question;
}


public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
public Question(int questionId, String question, List<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}

}
    

