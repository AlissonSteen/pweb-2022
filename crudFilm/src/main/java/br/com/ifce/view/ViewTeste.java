package br.com.ifce.view;

import br.com.ifce.model.Filme;

public class ViewTeste {
		
	public void view(Filme filme) {
		System.out.println("Titulo: "+ filme.getTitle());
		System.out.println("Duracao do filme: " + filme.getDuraction());
		System.out.println("Preco para alugar: " + filme.getPrice());
		System.out.println("Lancamento: " + filme.getDate());
	}
}
