package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Client;

public class ClientException {
	
	
	public void nameEmpty(Client c) {
		if(c.getName() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		 
	}
	
	public void emptyFields(Client c) {
		if(c.getName() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		} 
		if(c.getAddress() == null) {
			throw new IllegalStateException("{\r\n"
			+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'adress' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"adress\",\r\n"
					+ " \"message\": \"O campo 'adress' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}"); 
		}
		if(c.getCpf() == null) {
			throw new IllegalStateException("{\r\n"
			+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'cpf' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"cpf\",\r\n"
					+ " \"message\": \"O campo 'cpf' é obrigatório.\"\r\n"
					+ " 	}\r\n"
					+ " ]\r\n"
					+ "}");  
		}
		if(c.getTelephone() == null) {
			throw new IllegalStateException("{\r\n"
			+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'telephone' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"telephone\",\r\n"
					+ " \"message\": \"O campo 'telephone' é obrigatório.\"\r\n"
					+ " 	}\r\n"
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
						+ " \"message\": \"Não foi possivel criar cadastro do cliente.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"email\",\r\n"
						+ " \"message\": \"e-mail de endereço já existe.\"\r\n"
						+ " 	}\r\n"
						+ " ]\r\n"
						+ "}"); 
			} 
		}
	} 
	
	
}
