package ecommerceBooksMaven.exceptions;


import java.util.List;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.model.BookConnection;

public class BookException {
	private BookConnection c = new BookConnection();
	
	/**
	 * 
	 * Função que retorna uma exceção, caso qualquer atributo esteja vazio
	 */
	public void emptyFields(Book b) {
		if(b.getName() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'name' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"nome\",\r\n"
					+ " 		\"message\": \"The 'name' field is required.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getIsbn() == "") {
			throw new IllegalStateException("{\r\n" 
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'isbn' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	 {\r\n"
					+ " 		\"field\": \"isbn\",\r\n"
					+ " 		\"message\": \"The 'isbn' field is required.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n" 
					+ "}"); 
		}
		if(b.getAuthor() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'author' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"author\",\r\n"
					+ " 		\"message\": \"The 'author' field is required.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getPublisher() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'publisher' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"publisher\",\r\n"
					+ " 		\"message\": \"The 'publisher' field is required.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getDescription().length() < 10) { 
			throw new IllegalStateException("{\r\n" 
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'description' field is mandatory and must contain more than 10 characters.\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"description\",\r\n"
					+ " 		\"message\": \"The 'description' field is mandatory and must contain more than 10 characters.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(b.getPrice() == null || b.getPrice() <= 0) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'price' field is mandatory and cannot be less than or equal to zero..\",\r\n"
					+ " \"details\": [\r\n"
					+ " 	{\r\n"
					+ " 		\"field\": \"price\",\r\n"
					+ " 		\"message\": \"The 'price' field is mandatory and cannot be less than or equal to zero..\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
	
	}
	
	/**
	 * 
	 * @throws IllegalAccessException função que verifica se há um nome repetido
	 * Recebe como parametro o objeto Book e tenta executar a função create da classe BookConnection
	 * e caso tenha o nome repetido lança a exceção.
	 */
	public void checkDuplicateName(Book b) throws IllegalAccessException  {
		try {
			c.create(b);
		}catch(Exception e) {
			throw new IllegalAccessException("{\r\n"   
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"Unable to create book registration.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"name\",\r\n"
					+ " \"message\": \"name of the book already registered.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		  
	}
	
	/**
	 * 
	 * @return List
	 * @throws IllegalAccessException caso a lista tenha o tamanho zero
	 */
	public List<Book> emptyTable() throws IllegalAccessException {   
		BookConnection c = new BookConnection(); 
		if(c.findAll().size() ==0) {
			throw new IllegalAccessException("{\r\n"   
					+ " \"code\": 400,\r\n" 
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"Unable to show books.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"*\",\r\n"
					+ " \"message\": \"There are no books registered.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		}
		return c.findAll(); 
		
	}
	
	/**
	 * 
	 * @param i
	 * @return Book
	 * @throws IllegalAccessException caso o id informado não exista no banco de dados ou seja igual a zero
	 */
	public Book checkId(Long i) throws IllegalAccessException {
		if(c.findById(i) == null) { 
			throw new IllegalAccessException("{\r\n"   
					+ " \"code\": 400,\r\n" 
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"Unable to locate book information.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"*\",\r\n"
					+ " \"message\": \"there is no book with the given id.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		}
		
		return c.findById(i);
	}
}