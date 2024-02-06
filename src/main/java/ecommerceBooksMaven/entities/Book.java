package ecommerceBooksMaven.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ecommerceBooksMaven.model.BookConnection;

@Entity
public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String isbn;
	private String author;
	private String publisher;
	private String description;
	private Double price;
	private LocalDate realeseDate;
	
	public Book() {
	}

	public Book(Long id, String name, String isbn, String author, String publisher, String description, Double price,
			LocalDate realeseDate) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
		this.realeseDate = realeseDate;
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

	public LocalDate getRealeseDate() {
		return realeseDate;
	}

	public void setRealeseDate(LocalDate realeseDate) {
		this.realeseDate = realeseDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", author=" + author + ", publisher="
				+ publisher + ", description=" + description + ", price=" + price + ", realeseDate=" + realeseDate
				+ "]";
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
	
	public void insertBook() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of the book: ");
		String name = sc.nextLine();
		System.out.print("Enter the isbc of the book: ");
		String isbc = sc.nextLine();
		System.out.print("Enter the name of the book author: ");
		String author = sc.nextLine();
		System.out.print("Enter the name of the book publisher: ");
		String publisher = sc.nextLine();
		System.out.print("Enter the book description: ");
		String description = sc.nextLine();
		System.out.print("Enter the price of the book: ");
		Double price = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the book release date: ");
		String realeseDate = sc.nextLine();
		
		Book b = new Book(null, name, isbc, author, publisher, description, price, LocalDate.parse(realeseDate));
		
		BookConnection bc = new BookConnection();
		bc.create(b);
		sc.close();
	}
}
