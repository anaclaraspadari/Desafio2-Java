package ecommerceBooksMaven.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Book;



public class BookConnection {
	
	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private  EntityManager em = emf.createEntityManager();
	
	//Inseri os dados no banco
	public void create(Book obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Book.class, obj.getId()));
		System.out.println("Dados inseridos no banco!");
		em.close();
		emf.close();
	}

	//encontra uma entidade pelo id
	public void findById(Book obj, int i) {
		obj = em.find(Book.class, i);
		em.close();
		emf.close();
	}
	
	//remove um entidade pelo id 
	public void remove(Book obj,int i) {
		//serve para pegar uma entitade monitora pelo JPA
		findById(obj, i);
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();		
	}
	
/*	public void findAll(Object obj) {
		
		
	} */
	
}