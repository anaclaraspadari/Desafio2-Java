package ecommerceBooksMaven.application;

import java.util.Scanner;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.exceptions.BookException;
import ecommerceBooksMaven.exceptions.ClientException;
import ecommerceBooksMaven.model.BookConnection;

/**
 * @Application esta classe representa o view do modelo MVC, nela existe um menu
 *              interativo para selecionar as opções para as classes Book e
 *              Client. Para cada classe, existe uma opção de inserir, buscar
 *              todos os dados do banco, buscar por ID, atualizar e remover, E
 *              para cada uma das opções há a implementação da(s) exceção(ões).
 */
public class Application {

	public static void main(String[] args) throws IllegalAccessException {
		ClientException clientEx = new ClientException();

		BookException bookEx = new BookException();

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
					for (Client client : clientEx.emptyTable()) {
						System.out.println(client.toString());
					}
					break;
				case 2:
					System.out.println("Search for client");
					System.out.println("Enter the client ID to search for it ");
					Long id = sc.nextLong();
					clientEx.checkId(id);
					System.out.println(c.findById(id));
					break;
				case 3:
					System.out.println("Register new client");
					System.out.print("Enter the name of the client: ");
					String name = sc.nextLine();
					System.out.print("Enter the email of the client: ");
					String email = sc.nextLine();

					c = new Client(null, name, email);
					clientEx.emptyFields(c);
					clientEx.checkDuplicateEmail(c);
					break;
				case 4:
					System.out.println("Update client data");
					System.out.println("Enter the book ID to update the data: ");
					id = sc.nextLong();
					clientEx.checkId(id);
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
					clientEx.checkId(id);
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

					b = new Book(null, name, isbc, author, publisher, description, price);
					bookEx.emptyFields(b);
					bookEx.checkDuplicateName(b);
					break;
				case 4:
					System.out.println("Update book data");
					System.out.println("Enter the book ID to update the data: ");
					id = sc.nextLong();
					bookEx.checkId(id);
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
					bookEx.checkId(id);
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
	}

}
