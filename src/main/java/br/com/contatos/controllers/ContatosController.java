package br.com.contatos.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path(value="/contatos")
public class ContatosController {
	
	@Get("")
	public void index() {
	}
	
	@Get("/{id}")
	public void show(int id) {
		System.out.println(id);
	}
	
}
