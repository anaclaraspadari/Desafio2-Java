package ecommerceBooksMaven.application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.exceptions.ClientException;
import ecommerceBooksMaven.model.ProductConnection;



public class Application {

	public static void main(String[] args) {
		ClientException clientException = new ClientException();
		ProductConnection p = new ProductConnection();
		List<Client> clTeste = new ArrayList<>();
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
	//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	//	EntityManager em = emf.createEntityManager();
		
	/*	Client cl = new Client(null,"jhonata", "amanda@seila");
		clTeste.add(cl);
		
		Client cl1 = new Client(null,"Maisa", "amanda@seila");
		clientException.checkEmail(clTeste,cl1);
		p.create(cl); 
		   
	/*	clientException.nameEmpty(cl);
		em.getTransaction().begin();
		em.persist(cl);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
		
	//	Client  cl = new Client();
		p.findById(p, 0);
		*/
		Client  cl = new Client();
		clientException.checkTable(1);
		p.remove(cl,1);
		//p.findById(1);  
	}
		
}
