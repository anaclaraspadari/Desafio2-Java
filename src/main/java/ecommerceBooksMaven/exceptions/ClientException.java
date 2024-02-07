package ecommerceBooksMaven.exceptions;

import java.util.List;


import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.model.ProductConnection;

public class ClientException {
	
	
	public void nameEmpty(Client c) {
		if(c.getNome() == null) {
			throw new IllegalStateException("{\r\n"
					+ " \"code\": 400,\r\n"
					+ " \"status\": \"Bad Request\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\",\r\n"
					+ " \"details\": [\r\n"
					+ " {\r\n"
					+ " \"field\": \"nome\",\r\n"
					+ " \"message\": \"O campo 'nome' é obrigatório.\"\r\n"
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
						+ " \"message\": \"Não foi possivel criar cadastro do cliente.\",\r\n"
						+ " \"details\": [\r\n"
						+ " {\r\n"
						+ " \"field\": \"email\",\r\n"
						+ " \"message\": \"e-mail de endereço já existe.\"\r\n"
						+ " }\r\n"
						+ " ]\r\n"
						+ "}");
			} 
		}
	} 
	 public void checkTable(Integer i) {
		 ProductConnection p = new ProductConnection();
		 Client obj = new Client();
		 obj =  p.findById(i);
		 if(obj == null) {
			 throw new IllegalStateException("{\r\n"
						+ " \"code\": 400,\r\n"
						+ " \"status\": \"Bad Request\",\r\n"
						+ " \"message\": \"Não foi possivel recuperar as informações do clinte.\",\r\n"
						+ " \"details\": [\r\n"
						+ " 		{\r\n"
						+ "		   \"field\": \"*\",\r\n"
						+ " 		\"message\": \"tabela cliente vazia ou não há o Id exigido.\"\r\n"
						+ " 		}\r\n"
						+ " 	]\r\n"
						+ "}");
		 }else {
			 System.out.println(obj);
		 }
			
		
	 }
	
}
