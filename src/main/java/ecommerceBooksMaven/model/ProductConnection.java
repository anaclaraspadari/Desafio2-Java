package ecommerceBooksMaven.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ProductConnection {
	
	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private  EntityManager em = emf.createEntityManager();
	private ProductConnection product;
	
	//cria tabela
	public void create(ProductConnection obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
	}

	//encontra uma entidade pelo id
	public void findById(ProductConnection obj, int i) {
		obj = em.find(ProductConnection.class, i);
		em.close();
		emf.close();
	}
	
	//remove um entidade pelo id 
	public void remove(ProductConnection obj,int i) {
		//serve para pegar uma entitade monitora pelo JPA
		findById(obj, i);
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();		
	}
	
/*	public void findAll(Object obj) {
		
		
	} */
	
}
