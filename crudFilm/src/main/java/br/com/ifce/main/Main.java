package br.com.ifce.main;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class Main {
	
	public static void main(String[] args) {
		
		FilmeController filmeController = new FilmeController();
		
		Filme filme = new Filme();
		filme.setTitle("Happy Feet");
		filme.setDuraction(108);
		filme.setPrice(7.90);
		filme.setDate("24/11/2006");
		filmeController.saveFilm(filme);

		Filme newFilm = new Filme();
		newFilm.setTitle("Teste");
		newFilm.setDuraction(100);
		newFilm.setPrice(10.90);
		newFilm.setDate("04/05/2000");
		filmeController.attFilm(newFilm);

		
		filmeController.searchForId((long) 1);
		
		// filmeController.deleteFilm((long) 2);

	}
}
	
