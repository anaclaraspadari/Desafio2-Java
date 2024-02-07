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

	public void insert() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of the client: ");
		String name = sc.nextLine();
		System.out.print("Enter the email of the client: ");
		String email = sc.nextLine();

		Client c = new Client(null, name, email);
		ClientConnection cc = new ClientConnection();

		cc.create(c);
		sc.close();
	}

	public void remove() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the client ID to search for it ");
		Long id = sc.nextLong();
		ClientConnection cc = new ClientConnection();
		cc.remove(id);

		sc.close();
	}

	public List<Client> findAll() {

		ClientConnection cc = new ClientConnection();
		List<Client> clients = null;
		clients = cc.findAll();
		return clients;

	}

	public Client findById() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the client ID to search for it ");
		Long id = sc.nextLong();
		ClientConnection cc = new ClientConnection();

		sc.close();
		return cc.findById(id);
	}

	public void update() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the book ID to update the data: ");
		Long id = sc.nextLong();

		ClientConnection cc = new ClientConnection();
		cc.findById(id);
		sc.nextLine();
		System.out.print("Enter the name of the client: ");
		String name = sc.nextLine();
		System.out.print("Enter the email of the client: ");
		String email = sc.nextLine();

		Client c = new Client(id, name, email);

		cc.update(c);
		sc.close();
	}
}
