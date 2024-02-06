package ecommerceBooksMaven.entities.Application;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Book;

public class Application {

	public static void main(String[] args) {
		
		
		
		
//		Book b1 = new Book(null, "Omni Man", "123", "João das Neves", "Inova", "Super man do mau, que mata geral", 49.90, LocalDate.parse("2020-05-30"));

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
//		EntityManager em = emf.createEntityManager();
		
//		Scanner sc = new Scanner(System.in);
//			
//		System.out.print("Enter the name of the book: ");
//		String name = sc.nextLine();
//		System.out.print("Enter the isbc of the book: ");
//		String isbc = sc.nextLine();
//		System.out.print("Enter the name of the book author: ");
//		String author = sc.nextLine();
//		System.out.print("Enter the name of the book publisher: ");
//		String publisher = sc.nextLine();
//		System.out.print("Enter the book description: ");
//		String description = sc.nextLine();
//		System.out.print("Enter the price of the book: ");
//		Double price = sc.nextDouble();
//		sc.nextLine();
//		System.out.print("Enter the book release date: ");
//		String realeseDate = sc.nextLine();
		
		
		
//		Book b = new Book(null, name, isbc, author, publisher, description, price, LocalDate.parse(realeseDate));
//		em.getTransaction().begin();
//		em.persist(b);
////		em.persist(p2);
////		em.persist(p3);
//		em.getTransaction().commit();
//		
//		System.out.println(em.find(Book.class, b.getId()));
//		sc.close();
//		em.close();
//		emf.close();
		
		Book b = new Book();
//		b.insert();
		b.remove((long)5);
		System.out.println("Pronto");
	}
		
}
