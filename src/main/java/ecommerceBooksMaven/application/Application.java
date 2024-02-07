package ecommerceBooksMaven.application;

import ecommerceBooksMaven.entities.Client;
import java.util.Scanner;
import ecommerceBooksMaven.model.ProductConnection;



public class Application {

	public static void main(String[] args) {
		ProductConnection p = new ProductConnection();
		
	 	/* EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
		
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Bem vindo ao E-commerce Books! O que você gostaria de visualizar?\n\n(1)Produtos\n(2)Clientes(0)Sair");
		int option1=sc.nextInt();
		
		switch(option1) {
			case 1:
				System.out.println("Menu de Clientes\n\n(1)Listar todos os clientes\n(2)Pesquisar cliente\n(3)Cadastrar cliente\n(4)Atualizar dados do cliente\n(5)Excluir cliente\n(0)Voltar");
				int optionClient=sc.nextInt();
				switch(optionClient){
					case 1:
					System.out.println("Lista de clientes");
					break;
					case 2:
					System.out.println("Pesquisar cliente");
					break;
					case 3:
					System.out.println("Cadastrar novo cliente");
					break;
					case 4:
					System.out.println("Atualizar dados do cliente");
					case 5:
					System.out.println("Excluir dados do cliente");
					break;
					default:
					System.out.println("Ok, até mais!");
					break;
			}
			case 2:
				int optionBooks=sc.nextInt();
				switch(optionBooks){
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
		}
		
		

		sc.close();
		
		
		Client  cl = new Client();
		p.findById(p, 0);
		
	}
		
}
