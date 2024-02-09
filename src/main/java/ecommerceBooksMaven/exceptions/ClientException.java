package ecommerceBooksMaven.exceptions;

import java.util.List;

import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.model.ClientConnection;

public class ClientException {
	private ClientConnection cl = new ClientConnection();
	
	/**
	 * 
	 * Função que retorna uma exceção, caso qualquer atributo esteja vazio
	 */
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
	
	/**
	 * 
	 * @param i
	 * @return Client
	 * @throws IllegalAccessException caso o id informado não exista no banco de dados ou seja igual a zero
	 */
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
	
	/**
	 * 
	 * @return List
	 * @throws IllegalAccessException caso a lista tenha o tamanho zero
	 */
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
	
	/**
	 * 
	 * @throws IllegalAccessException função que verifica se há um email repetido
	 * Recebe como parametro o objeto Client e tenta executar a função create da classe ClientConnection
	 * e caso tenha o email repetido lança a exceção.
	 */
	public void checkDuplicateEmail(Client c) throws IllegalAccessException {
		for (Client cc : cl.findAll()) {
			if(cc.getEmail().equals(c.getEmail())) {
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
