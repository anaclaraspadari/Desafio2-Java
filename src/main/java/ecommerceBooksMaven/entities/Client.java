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
	private Integer id;
	private String name;
	private String email; 
	
	
	public Client() {
		
	}
	public Client(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
