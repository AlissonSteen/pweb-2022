package br.com.ifce.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {
	
	public void salvar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.save(filme);
		
		transacao.commit();
		
		
	}
	
	public void att(Filme filme) {
		
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.saveOrUpdate(filme);
		
		transacao.commit();
		
	}
	
	public Filme searchForId(Long cod) {
		
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		Filme filme = session.get(Filme.class, cod);

		transacao.commit();
		
		return filme;
	}
	
	public void deleteFilm(Long cod) {
		
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		
		Filme filme = null;
		filme = session.get(Filme.class, cod);
		session.delete(filme);
		
		transaction.commit();
		
		}

}
