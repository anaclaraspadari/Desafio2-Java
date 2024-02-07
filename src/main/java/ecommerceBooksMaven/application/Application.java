package ecommerceBooksMaven.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ecommerceBooksMaven.entities.Book;
import ecommerceBooksMaven.entities.Client;
import ecommerceBooksMaven.exceptions.ClientException;

public class Application {

	public static void main(String[] args) {
		ClientException clientException = new ClientException();

		List<Client> clTeste = new ArrayList<>();
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
		System.out.println(
				"Bem vindo ao E-commerce Books! O que você gostaria de visualizar?\n\n(1)Produtos\n(2)Clientes(0)Sair");
		int option1 = sc.nextInt();

		switch (option1) {
		case 1:
			System.out.println(
					"Menu de Clientes\n\n(1)Listar todos os clientes\n(2)Pesquisar cliente\n(3)Cadastrar cliente\n(4)Atualizar dados do cliente\n(5)Excluir cliente\n(0)Voltar");
			int optionClient = sc.nextInt();
			Client c = new Client();
			switch (optionClient) {
			case 1:
				System.out.println("Lista de clientes");
				for (Client client : c.findAll()) {
					System.out.println(client.toString());
				}
				break;
			case 2:
				System.out.println("Pesquisar cliente");
				System.out.println(c.findById());
				break;
			case 3:
				System.out.println("Cadastrar novo cliente");
				c.insert();
				break;
			case 4:
				System.out.println("Atualizar dados do cliente");
				System.out.println(c.findById());
				c.update();
			case 5:
				System.out.println("Excluir dados do cliente");
				c.remove();
				break;
			default:
				System.out.println("Ok, até mais!");
				break;
			}
		case 2:
			int optionBooks = sc.nextInt();
			Book b = new Book();
			switch (optionBooks) {
			case 1:
				System.out.println("Lista de produtos");
				for (Book book : b.findAll()) {
					System.out.println(book.toString());
				}
				break;
			case 2:
				System.out.println("Pesquisar produto");
				System.out.println(b.findById());
				break;
			case 3:
				System.out.println("Cadastrar produto");
				b.insert();
				break;
			case 4:
				System.out.println("Atualizar produto");
				System.out.println(b.findById());
				b.update();
			case 5:
				System.out.println("Excluir produto");
				b.remove();
				break;
			default:
				System.out.println("Ok, até mais!");
				break;
			}
		}

		sc.close();

		/*
		 * Client cl = new Client(); p.findById(p, 0);
		 * 
		 * Client cl = new Client(); clientException.checkTable(1); p.remove(cl,1);
		 * //p.findById(1);
		 */
	}

}
