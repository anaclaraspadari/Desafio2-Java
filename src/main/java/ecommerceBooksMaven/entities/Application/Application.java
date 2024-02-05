package ecommerceBooksMaven.entities.Application;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Book;

public class Application {

	public static void main(String[] args) {
		
		Book b1 = new Book(null, "Omni Man", "123", "João das Neves", "Inova", "Super man do mau, que mata geral", 49.90, LocalDate.parse("2020-05-30"), 12);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(b1);
//		em.persist(p2);
//		em.persist(p3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
		
}
