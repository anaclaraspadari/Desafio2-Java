package ecommerceBooksMaven.application;

import ecommerceBooksMaven.entities.Client;
import java.util.Scanner;
import ecommerceBooksMaven.model.ProductConnection;



public class Application {

	public static void main(String[] args) {
		ProductConnection p = new ProductConnection();
	/*	EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
		EntityManager em = emf.createEntityManager();
		
		Client cl = new Client(null,"mulher maravilha", "gui.amapa22@gmail.com");
		em.getTransaction().begin();
		em.persist(cl);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
		
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Bem vindo ao E-commerce Books! O que você gostaria de visualizar?\n\n(1)Listar produtos\n(2)Buscar produto\n(3)Cadastrar pedido\n(4)Atualizar produto\n(5)Excluir produto\n(0)Sair");
		int option=sc.nextInt();
		switch(option){
			case 1:
			System.out.println("Lista de produtos");
			break;
			case 2:
			System.out.println("Pesquisar produto");
			break;
			case 3:
			System.out.println("Cadastrar pedido");
			break;
			case 4:
			System.out.println("Atualizar produto");
			case 5:
			System.out.println("Excluir produto");
			break;
			default:
			System.out.println("Ok, até mais!");
			break;
		}

		sc.close();
		
		
		Client  cl = new Client();
		p.findById(p, 0);
		
	}
		
}
