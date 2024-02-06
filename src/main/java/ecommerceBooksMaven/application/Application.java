package ecommerceBooksMaven.application;

import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.model.ProductConnection;



public class Application {

	public static void main(String[] args) {
		ProductConnection p = new ProductConnection();
	/*	EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
		EntityManager em = emf.createEntityManager();
		
		Client cl = new Client(null,"mulher maravilha", "gui.amapa22@gmail.com");
		em.getTransaction().begin();
		em.persist(cl);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
		
		*/
		
		
		Client  cl = new Client();
		p.findById(p, 0);
		
	}
		
}
