package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.model.BookConnection;
import ecommerceBooksMaven.model.ClientConnection;

public class ClientException {
	private ClientConnection cl = new ClientConnection();
	public void nameEmpty(Client c) {
		if(c.getName() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' � obrigat�rio.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"O campo 'nome' � obrigat�rio.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		 
	}
	
	public void emptyFields(Client c) {
		if(c.getName() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' � obrigat�rio.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"O campo 'nome' � obrigat�rio.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		if(c.getEmail() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'email' � obrigat�rio.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"email\",\r\n"
					+ " \"message\": \"O campo 'email' � obrigat�rio.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		
	
		
	}
	public void checkDuplicateEmail(Client c) throws IllegalAccessException  {
		
		try {
			cl.create(c);
		}catch(Exception e) {
			throw new IllegalAccessException("{\r\n"   
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"N�o foi possivel cadastrar cliente.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"email\",\r\n"
					+ " \"message\": \"email j� cadastrado.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		
		} 
		  
	}
	public Client checkId(Long i) throws IllegalAccessException {
		if(cl.findById(i) == null) { 
			throw new IllegalAccessException("{\r\n"   
					+ " \"code\": 400,\r\n" 
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"N�o foi possivel localizar as informa��es do cliente.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"*\",\r\n"
					+ " \"message\": \"n�o h� cliente com o id informado.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		}
		
		return cl.findById(i);
	}
	
}
