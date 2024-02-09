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

import ecommerceBooksMaven.model.BookConnection;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table (name = "book",
uniqueConstraints = @javax.persistence.UniqueConstraint(columnNames = "name"))

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String isbn;
	private String author;
	private String publisher;
	private String description;
	private Double price;

	public Book() {
	}

	public Book(Long id, String name, String isbn, String author, String publisher, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.description = description; 
		this.price = price;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", author=" + author + ", publisher="
				+ publisher + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id); 
	}
	

	public void insert(Book b) {

		BookConnection bc = new BookConnection();
		bc.create(b);
	}

	public void remove(Long id) {

		BookConnection bc = new BookConnection();
		bc.remove(id);
	}

	public List<Book> findAll() {
		
		BookConnection bc = new BookConnection();
		List<Book> books = null; 
		books = bc.findAll();
		return books; 
	}

	public Book findById(Long id) {

		BookConnection bc = new BookConnection();
		return bc.findById(id);
	}

	public void update(Book b) {

		BookConnection bc = new BookConnection();
		bc.update(b);
	}
}
