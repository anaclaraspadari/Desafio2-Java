package ecommerceBooksMaven.application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import ecommerceBooksMaven.entities.Client;
<<<<<<< HEAD
import ecommerceBooksMaven.exceptions.ClientException;
=======
import java.util.Scanner;
>>>>>>> menuimplementation
import ecommerceBooksMaven.model.ProductConnection;



public class Application {

	public static void main(String[] args) {
		ClientException clientException = new ClientException();
		
		List<Client> clTeste = new ArrayList<>();
	/*	EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
=======
		
	 	/* EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
>>>>>>> menuimplementation
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close(); 
		 
		*/ 
	//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	//	EntityManager em = emf.createEntityManager();
		
	/*	Client cl = new Client(null,"jhonata", "amanda@seila");
		clTeste.add(cl);
		
		Client cl1 = new Client(null,"Maisa", "amanda@seila");
		clientException.checkEmail(clTeste,cl1);
		p.create(cl); 
		   
	/*	clientException.nameEmpty(cl);
		em.getTransaction().begin();
		em.persist(cl);
		em.getTransaction().commit();
		System.out.println("Tabela criada!");
		em.close();
		emf.close();
		
<<<<<<< HEAD
	//	Client  cl = new Client();
=======
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
		
		
		/*Client  cl = new Client();
		p.findById(p, 0);
		
		Client  cl = new Client();
		clientException.checkTable(1);
		p.remove(cl,1);
		//p.findById(1);*/  
	}
		
}
