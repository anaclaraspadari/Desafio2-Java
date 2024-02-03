package ecommerceBooksMaven.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Model {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private static EntityManager em = emf.createEntityManager();

	
	//cria tabela
	public void create(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
	}

	//encontra uma entidade pelo id
	public void findById(Object obj, int i) {
		obj = em.find(Object.class, i);
		em.close();
		emf.close();
	}
	
	//remove um entidade pelo id 
	public void remove(Object obj,int i) {
		//serve para pegar uma entitade monitora pelo JPA
		findById(obj, i);
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
				
	}
	
}
