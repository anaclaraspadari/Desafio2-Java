package ecommerceBooksMaven.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email; 
	private String telephone;
	private String cpf;
	private  String address;
	
	public Client() {
		
	}
	
	
	public Client(Long id, String name, String email, String telephone, String cpf, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.cpf = cpf;
		this.address = address;
	}
	

	public synchronized Long getId() {
		return id;
	}


	public synchronized void setId(Long id) {
		this.id = id;
	}


	public synchronized String getName() {
		return name;
	}


	public synchronized void setName(String name) {
		this.name = name;
	}


	public synchronized String getEmail() {
		return email;
	}


	public synchronized void setEmail(String email) {
		this.email = email;
	}


	public synchronized String getTelephone() {
		return telephone;
	}


	public synchronized void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public synchronized String getCpf() {
		return cpf;
	}


	public synchronized void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public synchronized String getAddress() {
		return address;
	}


	public synchronized void setAddress(String address) {
		this.address = address;
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
		return "Client [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	 

}
