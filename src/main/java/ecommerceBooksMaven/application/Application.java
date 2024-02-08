package ecommerceBooksMaven.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.exceptions.BookException;
import ecommerceBooksMaven.exceptions.ClientException;
import ecommerceBooksMaven.model.BookConnection;

public class Application {

	public static void main(String[] args) throws IllegalAccessException {
		ClientException clientException = new ClientException();
		List<Client> listClient = new ArrayList<>();
		List<Book> listBook = new ArrayList<>();
		BookException bookEx = new BookException();
		/*
		 * EntityManagerFactory emf =
		 * Persistence.createEntityManagerFactory("books-jpa"); =======
		 * 
		 * /* EntityManagerFactory emf =
		 * Persistence.createEntityManagerFactory("books-jpa"); >>>>>>>
		 * menuimplementation EntityManager em = emf.createEntityManager();
		 * 
		 * em.close(); emf.close();
		 * 
		 */
		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("books-jpa");
		// EntityManager em = emf.createEntityManager();

		/*
		 * Client cl = new Client(null,"jhonata", "amanda@seila"); clTeste.add(cl);
		 * 
		 * Client cl1 = new Client(null,"Maisa", "amanda@seila");
		 * clientException.checkEmail(clTeste,cl1); p.create(cl);
		 * 
		 * /* clientException.nameEmpty(cl); em.getTransaction().begin();
		 * em.persist(cl); em.getTransaction().commit();
		 * System.out.println("Tabela criada!"); em.close(); emf.close();
		 * 
		 * <<<<<<< HEAD // Client cl = new Client(); =======
		 */
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		do {
			System.out.println(
					"Welcome to E-commerce Books! What would you like to see?\n\n(1)Clients\n(2)Books\n(0)Sign out");
			int option1 = sc.nextInt();

			switch (option1) {
			case 0:
				isTrue = false; 
				break;
			case 1:
				System.out.println(
						"Client's Menu\n\n(1)List all cliente\n(2)Search for cliente\n(3)Register new cliente\n(4)Update client data\n(5)Delete client data\n(0)Back");
				int optionClient = sc.nextInt();
				sc.nextLine();
				Client c = new Client();
				switch (optionClient) {
				case 1:
					System.out.println("List all clients");
					for (Client client : c.findAll()) {
						System.out.println(client.toString());
					}
					break;
				case 2:
					System.out.println("Search for client");
					System.out.println("Enter the client ID to search for it ");
					Long id = sc.nextLong();
					System.out.println(c.findById(id));
					break;
				case 3:
					System.out.println("Register new client");
					System.out.print("Enter the name of the client: ");
					String name = sc.nextLine();
					System.out.print("Enter the email of the client: ");
					String email = sc.nextLine();

					c = new Client(null, name, email);
					c.insert(c);
					break;
				case 4:
					System.out.println("Update client data");
					System.out.println("Enter the book ID to update the data: ");
					id = sc.nextLong();
					sc.nextLine();
					System.out.println(c.findById(id));
					System.out.print("Enter the name of the client: ");
					name = sc.nextLine();
					System.out.print("Enter the email of the client: ");
					email = sc.nextLine();

					c = new Client(id, name, email);
					c.update(c);
					break;
				case 5:
					System.out.println("Delete client data");
					System.out.println("Enter the client ID to search for it ");
					id = sc.nextLong();
					c.remove(id);
					break;
				default:
					System.out.println("Ok, see you next time!");
					break;
				}
				break;
			case 2:
				System.out.println(
						"Book's Menu\n\n(1)List all books\n(2)Search book\n(3)Register book\n(4)Update book data\n(5)Delete book\n(0)Back");
				int optionBooks = sc.nextInt();
				sc.nextLine();
				Book b = new Book();
				switch (optionBooks) {  
				case 1:
					
					System.out.println("List all books");
					BookConnection c1 = new BookConnection();
					
					for (Book book : bookEx.emptyTable()) {
						
						System.out.println(book.toString());
					}
					break;
				case 2: 
					System.out.println("Search for book");
					System.out.println("Enter the book ID to search for it ");
					Long id = sc.nextLong(); 
					System.out.println(bookEx.checkId(id)); 
					
					//AQUIIIII   
					break;
				case 3:
					System.out.println("Register new book");
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

					b = new Book(null, name, isbc, author, publisher, description , price);
					bookEx.emptyFields(b);
					bookEx.checkDuplicateName(b); 
					break; 
				case 4:
					System.out.println("Update book data");
					System.out.println("Enter the book ID to update the data: ");
					id = sc.nextLong();
					sc.nextLine();
					System.out.print("Enter the name of the book: ");
					name = sc.nextLine();
					System.out.print("Enter the isbc of the book: ");
					isbc = sc.nextLine();
					System.out.print("Enter the name of the book author: ");
					author = sc.nextLine();
					System.out.print("Enter the name of the book publisher: ");
					publisher = sc.nextLine();
					System.out.print("Enter the book description: ");
					description = sc.nextLine();
					System.out.print("Enter the price of the book: ");
					price = sc.nextDouble();

					b = new Book(id, name, isbc, author, publisher, description, price);
					
					b.update(b);
					break;
				case 5:
					System.out.println("Delete book data");
					System.out.println("Enter the book ID to search for it ");
					id = sc.nextLong();
					b.remove(id);
					break;
				default:
					System.out.println("Ok, see you next time!");
					break;
				}
				break;
			default:
				System.out.println("Digit a valid option!");
				break;
			}
		} while (isTrue);
		sc.close();
		System.out.println("END OF PROGRAM"); 
		

		/*
		 * Client cl = new Client(); p.findById(p, 0);
		 * 
		 * Client cl = new Client(); clientException.checkTable(1); p.remove(cl,1);
		 * //p.findById(1);
		 */
	}

}
