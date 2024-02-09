package ecommerceBooksMaven.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Book;



public class BookConnection {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private  static EntityManager em = emf.createEntityManager();
	
	//Inseri os dados no banco
	public void create(Book obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Book.class, obj.getId()));
		System.out.println("Data entered into the database!");
		em.close();
		emf.close();  
	}   
	
	//remove um entidade pelo id  
	public void remove(Long i) {
		em.getTransaction().begin();
		//serve para pegar uma entitade monitora pelo JPA
		em.remove(em.find(Book.class, i));
		em.getTransaction().commit();	
		System.out.println("Data removed from the database!");
		em.close();
		emf.close();
	}
	
	public List<Book> findAll()   {
		
		List<Book> books = null; 
		books = em.createQuery("from Book").getResultList();
		return books;
	}

	public Book findById(Long i) { 
		 
		return em.find(Book.class , i);
	}
	
	public void update(Book obj) { 
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Book.class, obj.getId()));
		System.out.println("Updated data in the database!");
		em.close();
		emf.close();
	}
	
}