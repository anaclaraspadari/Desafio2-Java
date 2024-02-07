package ecommerceBooksMaven.entities.Application;

import ecommerceBooksMaven.entities.Book;

public class Application {

	public static void main(String[] args) {
		
		Book b = new Book();
//		b.insert();
//		b.remove((long)5);
		
//		for(Book book: b.findAll()) {
//			System.out.println(book.toString());
//		}
		
		System.out.println(b.findById((long)6));
		b.update();
		
		System.out.println("Pronto");
	}
		
}
