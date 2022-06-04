package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;
import br.com.ifce.view.ViewTeste;

public class FilmeController {
	
	private FilmeService filmeService = new FilmeService();
	
	public void saveFilm(Filme filme) {
		filmeService.saveFilm(filme);
	}
	
	public void searchForId(Long cod) {
		Filme filme = filmeService.searchForId(cod);
		ViewTeste viewMain = new ViewTeste();
		viewMain.view(filme);
		
	}

	public void attFilm(Filme filme) {
		filmeService.attFilm(filme);
	}

	public void deleteFilm(Long cod) {
		filmeService.deleteFilm(cod);
	}
	
	

}
