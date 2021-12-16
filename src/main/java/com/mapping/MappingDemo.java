package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
	
        //Creating Question
       /* Question q1=new Question();
        q1.setQuestionId(3000);
       */// q1.setQuestion("What is Java?");
        
        //Creating Answer
     /* Answer answer=new Answer();
        answer.setAnswer_Id(991);
       /// answer.setAnswer("Java is a Programming Language.");
       
      //Creating Answer
         Answer answer1=new Answer();
         answer1.setAnswer_Id(992);
         answer1.setAnswer("Java is independet platform.");
       
      /*Creating Answer
        Answer answer2=new Answer();
        answer2.setAnswer_Id(993);
       */// answer2.setAnswer("Java has different frameworks.");
       
      /*  List<Answer>list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
      *///  q1.setAnswers(list);
     
        //Session
        
        Session s=factory.openSession();
        
        Transaction tx=s.beginTransaction();
        
      //save
     /*   s.save(q1);
        s.save(answer);
        s.save(answer1);
      */// s.save(answer2);
        
        Question q=(Question)s.get(Question.class, 3000);
        
        System.out.println(q.getQuestion());
        
        for(Answer a:q.getAnswers())
        {
        	System.out.println(a.getAnswer());
        }
        
        
        tx.commit();
        
      //Question newQ =(Question) s.get(Question.class,420);
        //System.out.println(newQ.getQuestion());
       // System.out.println(newQ.getAnswer().getAnswer());
        
	}
	
	
}
        