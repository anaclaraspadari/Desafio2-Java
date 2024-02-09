package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.model.ClientConnection;

public class ClientException {
	private ClientConnection cl = new ClientConnection();
	
	public void emptyFields(Client c) {
		if(c.getName() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'name' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"The 'name' field is required.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		if(c.getEmail() == "") {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"The 'email' field is required.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"email\",\r\n"
					+ " \"message\": \"The 'email' field is required.\"\r\n"
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
					+ " \"message\": \"Unable to locate customer information.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"*\",\r\n"
					+ " \"message\": \"there is no customer with the specified id.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		}
		
		return cl.findById(i); 
	}
	public List<Client> emptyTable() throws IllegalAccessException {  
		if(cl.findAll().size() ==0) {
			throw new IllegalAccessException("{\r\n"    
					+ " \"code\": 400,\r\n" 
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"Unable to show customers.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"*\",\r\n"
					+ " \"message\": \"There are no registered customers.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");
		}
		return cl.findAll(); 
		
	}
	
	public void checkDuplicateEmail(Client c) throws IllegalAccessException {
		
		for (Client cc : cl.findAll()) {
			if(cc.equals(c)) {
				throw new IllegalAccessException("{\r\n"   
						+ " \"code\": 400,\r\n"
						+ " \"status\": \"Bad Request\",\r\n"
						+ " \"message\": \"Unable to register customer.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"email\",\r\n"
						+ " \"message\": \"E-mail already registered.\"\r\n"
						+ " 	}\r\n"
						+ " ]\r\n"
						+ "}"); 
			}
		}
	}
	

	
}
