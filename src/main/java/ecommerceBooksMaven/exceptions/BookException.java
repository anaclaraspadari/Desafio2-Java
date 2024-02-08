package ecommerceBooksMaven.exceptions;

import java.util.List;

import org.hibernate.internal.ExceptionConverterImpl;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.model.BookConnection;

public class BookException {
	
	public void emptyFields(Book b) {
		if(b.getName() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"nome\",\r\n"
					+ " 		\"message\": \"O campo 'nome' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getIsbn() == "") {
			throw new IllegalStateException("{\r\n" 
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'isbn' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	 {\r\n"
					+ " 		\"field\": \"isbn\",\r\n"
					+ " 		\"message\": \"O campo 'isbn' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getAuthor() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'author' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"author\",\r\n"
					+ " 		\"message\": \"O campo 'author' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getPublisher() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'publisher' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"publisher\",\r\n"
					+ " 		\"message\": \"O campo 'publisher' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getDescription().length() < 10) { 
			throw new IllegalStateException("{\r\n" 
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'description' é obrigatório e deve conter mais de 10 caracteres.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"description\",\r\n"
					+ " 		\"message\": \"O campo 'description' é obrigatório e deve conter mais de 10 caracteres.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getPrice() == null || b.getPrice() <= 0) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'price' é obrigatório e não pode ser menor ou igual a zero..\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"price\",\r\n"
					+ " 		\"message\": \"O campo 'price' é obrigatório e não pode ser menor ou igual a zero..\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
	
	}
	public void checkName(List<Book> listBook, Book bo) {  
		for(Book b: listBook) { 
			if(b.equals(bo)) { 
				throw new IllegalStateException("{\r\n" 
						+ " \"code\": 400,\r\n"
						+ " \"status\": \"Bad Request\",\r\n"
						+ " \"message\": \"Não foi possivel criar cadastro do livro.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"name\",\r\n"
						+ " \"message\": \"nome do livro já cadastrado.\"\r\n"
						+ " 	}\r\n"
						+ " ]\r\n"
						+ "}"); 
			} 
		}
	} 
	public void teste(Book b) throws IllegalAccessException  {
		BookConnection c = new BookConnection();
		try {
			c.create(b);
		}catch(Exception e) {
			throw new IllegalAccessException("{\r\n"  
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"Não foi possivel criar cadastro do livro.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"name\",\r\n"
					+ " \"message\": \"nome do livro já cadastrado.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		
		}
		
	}
}