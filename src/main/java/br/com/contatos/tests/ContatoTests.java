package br.com.contatos.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.contatos.models.Contato;

public class ContatoTests {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Luan Oliveira");
		contato.setEmail("luan@java.com");
		contato.setSexo('m');
		System.out.println(contato);

	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("treinamentos");

	    EntityManager manager = factory.createEntityManager();
	   
	    manager.getTransaction().begin();    
	    manager.persist(contato);
	    manager.getTransaction().commit();
	}

}
