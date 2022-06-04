package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	private FilmeRepository filmeRepository = new FilmeRepository();
	
	public void saveFilm(Filme filme) {
		filmeRepository.salvar(filme);
	}
	
	public void attFilm(Filme filme) {
		filmeRepository.att(filme);
	}
	
	public Filme searchForId(Long cod) {
		Filme filme = filmeRepository.searchForId(cod);
		return filme;
	}
	
	public void deleteFilm(Long cod) {
		filmeRepository.deleteFilm(cod);
	}

}
