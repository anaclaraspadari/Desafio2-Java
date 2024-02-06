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
	
	//remove um entidade pelo id 
	public void remove(Long i) {
		em.getTransaction().begin();
		//serve para pegar uma entitade monitora pelo JPA
		em.remove(em.find(Book.class, i));
		em.getTransaction().commit();	
		System.out.println("Dados removidos do banco!");
	}
	
/*	public void findAll(Object obj) {
		
		
	} */
	
}