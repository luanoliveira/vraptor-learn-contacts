package br.com.contatos.controllers;

//import java.util.Calendar;

//import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
//import br.com.caelum.vraptor.Result;
import br.com.contatos.models.Contato;

@Controller
@Path(value="/contatos")
public class ContatosController {
	
	@Get("")
	public void index() {
	}
	
	/*
	@Get("/{id}")
	public void show(int id) {
		System.out.println(id);
	}
	*/
	
	protected void addContato() {
		Contato contato = new Contato();
		contato.setNome("Luan Oliveira");
		contato.setEmail("luan@java.com");
		contato.setSexo('m');
		    
	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("treinamentos");
	    EntityManager manager = factory.createEntityManager();
	   
	    manager.getTransaction().begin();    
	    manager.persist(contato);
	    manager.getTransaction().commit();
	}
	

	
	@Get("/create")
	public void create() {
		this.addContato();
	}
	
}
