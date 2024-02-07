package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Client;

public class ClientException {
	
	
	public void nameEmpty(Client c) {
		if(c.getNome() == null) {
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
//	 public void checkTable(Integer i) {
//		 ProductConnection p = new ProductConnection();
//		 Client obj = new Client();
//		 obj =  p.findById(i);
//		 if(obj == null) {
//			 throw new IllegalStateException("{\r\n"
//						+ " \"code\": 400,\r\n"
//						+ " \"status\": \"Bad Request\",\r\n"
//						+ " \"message\": \"N�o foi possivel recuperar as informa��es do clinte.\",\r\n"
//						+ " \"details\": [\r\n"
//						+ " 		{\r\n"
//						+ "		   \"field\": \"*\",\r\n"
//						+ " 		\"message\": \"tabela cliente vazia ou n�o h� o Id exigido.\"\r\n"
//						+ " 		}\r\n"
//						+ " 	]\r\n"
//						+ "}");
//		 }else {
//			 System.out.println(obj);
//		 }
//			
//		
//	 }
	
}
