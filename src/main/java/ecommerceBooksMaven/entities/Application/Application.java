package ecommerceBooksMaven.entities.Application;

import ecommerceBooksMaven.entities.Book;

public class Application {

	public static void main(String[] args) {
		
		
//		Book b = new Book(null, name, isbc, author, publisher, description, price, LocalDate.parse(realeseDate));
//		em.getTransaction().begin();
//		em.persist(b);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		
//		System.out.println(em.find(Book.class, b.getId()));
//		sc.close();
//		em.close();
//		emf.close();
		
		Book b = new Book();
//		b.insert();
//		b.remove((long)5);
		
//		for(Book book: b.findAll()) {
//			System.out.println(book.toString());
//		}
		
		System.out.println(b.findById((long)6));
		
		System.out.println("Pronto");
	}
		
}
