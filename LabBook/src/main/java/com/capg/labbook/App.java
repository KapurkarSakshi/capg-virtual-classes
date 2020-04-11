package com.capg.labbook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory factory=Persistence.createEntityManagerFactory("CapgAuthor");
       EntityManager em=factory.createEntityManager();
       EntityTransaction tx=em.getTransaction();
       
       Author a1=new Author(1,"T","Vasu","Reddy",96409);
       Author a2=new Author(2,"T","Sakku","kappu",96409);
       Author a3=new Author(3,"T","Shivu","Kapurkar",96409);
       Author a4=new Author(4,"T","Bannu","Kappu",96409);
       tx.begin();
       em.persist(a1);
       em.persist(a2);
       em.persist(a3);
       em.persist(a4);
       tx.commit();
       System.out.println("author details inserted..");
     
       // delete
       tx.begin();
       em.remove(a3);
       tx.commit();
       System.out.println("Details...!!");
      
       TypedQuery<Author> query= em.createQuery("from Author",Author.class);
   	List<Author> allStudents=query.getResultList();
   	 allStudents.forEach(s->System.out.println(s));
       
    }
}
