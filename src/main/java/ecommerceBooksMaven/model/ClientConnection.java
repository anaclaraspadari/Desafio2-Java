package ecommerceBooksMaven.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ecommerceBooksMaven.entities.Client;

public class ClientConnection {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("books-jpa");
	private EntityManager em = emf.createEntityManager();

	/**
	 * 
	 * Inseri os dados no banco
	 */
	public void create(Client obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Client.class, obj.getId()));
		System.out.println("Data entered into the database!");
		em.close();
		emf.close();
	}

	/**
	 * 
	 * Remove uma entidade pelo id 
	 * Método find() serve para pegar uma entitade monitora pelo JPA
	 */
	public void remove(Long i) {
		em.getTransaction().begin();
		em.remove(em.find(Client.class, i));
		em.getTransaction().commit();
		System.out.println("Data removed from the database!");
		em.close();
		emf.close();
	}

	/**
	 * 
	 * @return retorna todos os clientes cadastrados no banco de dados
	 */
	public List<Client> findAll() {

		List<Client> clients = null;
		return clients = em.createQuery("from Client").getResultList();
	}

	/**
	 * 
	 * @return retorna um cliente do banco com base no ID
	 */
	public Client findById(Long i) {

		return em.find(Client.class, i);
	}

	/**
	 * 
	 * Atualiza os dados do cliente selecionado pelo ID
	 */
	public void update(Client obj) {
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		System.out.println(em.find(Client.class, obj.getId()));
		System.out.println("Updated data in the database!");
		em.close();
		emf.close();
	}
}
