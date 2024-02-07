package ecommerceBooksMaven.application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.exceptions.BookException;
import ecommerceBooksMaven.exceptions.ClientException;
import ecommerceBooksMaven.model.BookConnection;




public class Application {

	public static void main(String[] args) {
		ClientException clientException = new ClientException();
		BookException bookException = new BookException();
		List<Client> listClient = new ArrayList<Client>();
		List<Book> listBook = new ArrayList<Book>();
		BookConnection bc  =new BookConnection();
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
	//	Client  cl = new Client(); 
	//	clientException.checkTable(1);
		//p.remove(cl,1); 
		//p.findById(1);  
		Book b = new Book(null,"Alice no pais das maravilhas", "12334", "stephan","matrix", "tsdsbdffvsddvdsb", 23.70);
		listBook.add(b);
		Book b1 = new Book(null,"Alice no pais das maravilhas", "34454", "stephan","matrix", "tsdfvsgbxvsvervsdvds", 23.70);
		listBook.add(b1);
		bookException.emptyFields(b1);
		bookException.checkName(listBook,b1);  
		
		bc.create(b); 
	}
		
}
