package ecommerceBooksMaven.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ecommerceBooksMaven.model.ClientConnection;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;

	public Client() {

	}

	public Client(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
		return "Client [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

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
