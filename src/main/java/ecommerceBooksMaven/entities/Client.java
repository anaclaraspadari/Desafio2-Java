package ecommerceBooksMaven.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ecommerceBooksMaven.model.ClientConnection;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	public Client() {

	}

	public Client(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
/**
 * As funções hashcode e equals comparam se o email é igual nos dois objetos.
 */
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return "{\nid=" + id + ",\nname=" + name + ", \nemail=" + email + "\n}";
	}

	/**
	 * Funções referentes ao CRUD da classe. As funções recebem a objeto da própria
	 * classe ou atributo identificador.
	 */
	public void insert(Client c) {

		ClientConnection cc = new ClientConnection();
		cc.create(c);
	}

	public void remove(Long id) {

		ClientConnection cc = new ClientConnection();
		cc.remove(id);
	}

	public List<Client> findAll() {

		ClientConnection cc = new ClientConnection();
		List<Client> clients = null;
		clients = cc.findAll();
		return clients;
	}

	public Client findById(Long id) {

		ClientConnection cc = new ClientConnection();
		return cc.findById(id);
	}

	public void update(Client c) {

		ClientConnection cc = new ClientConnection();
		cc.update(c);
	}
}
