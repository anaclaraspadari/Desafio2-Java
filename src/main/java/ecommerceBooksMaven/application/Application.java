package ecommerceBooksMaven.application;

import ecommerceBooksMaven.entities.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

	public static void main(String[] args) {	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
		EntityManager em = emf.createEntityManager();
		
		Client cl = new Client(null,"mulher maravilha", "gui.amapa22@gmail.com");
		em.getTransaction().begin();
		em.persist(cl);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
		
	}
		
}
