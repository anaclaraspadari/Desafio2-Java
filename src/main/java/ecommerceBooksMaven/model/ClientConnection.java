package ecommerceBooksMaven.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Client;

public class ClientConnection {

	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private  EntityManager em = emf.createEntityManager();
	
	//Inseri os dados no banco
	public void create(Client obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Client.class, obj.getId()));
		System.out.println("Data entered into the database!");
		em.close();
		emf.close();
	}
	
	//remove um entidade pelo id 
	public void remove(Long i) {
		em.getTransaction().begin();
		//serve para pegar uma entitade monitora pelo JPA
		em.remove(em.find(Client.class, i));
		em.getTransaction().commit();	
		System.out.println("Data removed from the database!");
		em.close();
		emf.close(); 
	}
	
	public List<Client> findAll() {
		
		List<Client> clients = null;
		clients = em.createQuery("from Client").getResultList();
		return clients;
	}

	public Client findById(Long i) {
		
		return em.find(Client.class , i);
	}
	
	public void update(Client obj) {
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Client.class, obj.getId()));
		System.out.println("Updated data in the database!");
		em.close();
		emf.close();
	}
}
