package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Book;

public class BookException {
	public void nameEmpty(Book b) {
		if(b.getName() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"nome\",\r\n"
					+ " 		\"message\": \"O campo 'nome' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ "	 ]\r\n"
					+ "}");
		} 
		 
	}
	public void isbnEmpty(Book b) {
		if(b.getIsbn() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'isbn' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"isbn\",\r\n"
					+ " 		\"message\": \"O campo 'isbn' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ "	 ]\r\n"
					+ "}");
		}
	}
	public void authorEmpty(Book b) {
		if(b.getAuthor() == null) {
			throw new IllegalStateException("{\r\n" 
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'author' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"author\",\r\n"
					+ " 		\"message\": \"O campo 'author' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ "	 ]\r\n"
					+ "}");
		}
	}
	
	public void publisherEmpty(Book b) {
		
	}
	
	public void descriptionEmpty(Book b) {
		
	}
	
	//verificar com o grupo se vale a pena deixar todos juntos
	public void emptyFields(Book b) {
		if(b.getName() == null) {
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
		if(b.getIsbn() == null) {
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
		if(b.getAuthor() == null) {
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
		if(b.getPublisher() == null) {
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
		if(b.getDescription() == null || b.getDescription().length() < 10) { 
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
						+ " \"message\": \"Não foi possivel criar cadastro do produto.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"name\",\r\n"
						+ " \"message\": \"nome do produto já cadastrado.\"\r\n"
						+ " 	}\r\n"
						+ " ]\r\n"
						+ "}"); 
			} 
		}
	} 
}
