package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Client;

public class ClientException {
	
	
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
					+ " }\r\n"
					+ " ]\r\n"
					+ "}");
		} 
		 
	}
	
	public void checkEmail(List<Client> c, Client cc) { 
		for(Client t: c) {
			if(t.equals(cc)) {
				throw new IllegalStateException("{\r\n"
						+ " \"code\": 400,\r\n"
						+ " \"status\": \"Bad Request\",\r\n"
						+ " \"message\": \"N�o foi possivel criar cadastro do cliente.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"email\",\r\n"
						+ " \"message\": \"e-mail de endere�o j� existe.\"\r\n"
						+ " }\r\n"
						+ " ]\r\n"
						+ "}");
			} 
		}
	} 
	
	
}
