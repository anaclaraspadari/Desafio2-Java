package ecommerceBooksMaven.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Integer qtyStock;
	
	public Book() {
	}

	public Book(Long id, String name, String isbn, String author, String publisher, String description, Double price,
			LocalDate realeseDate, Integer qtyStock) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
		this.realeseDate = realeseDate;
		this.qtyStock = qtyStock;
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

	public Integer getQtyStock() {
		return qtyStock;
	}

	public void setQtyStock(Integer qtyStock) {
		this.qtyStock = qtyStock;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", isbn=" + isbn + ", author=" + author + ", publisher="
				+ publisher + ", description=" + description + ", price=" + price + ", realeseDate=" + realeseDate
				+ ", qtyStock=" + qtyStock + "]";
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
	
}
