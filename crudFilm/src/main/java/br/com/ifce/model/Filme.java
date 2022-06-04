package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cod;
	private String title;
	private int duraction;
	private Double price;
	private String date;
	
	
	public Long getCod() {
		return cod;
	}
	
	public void setCod(Long cod) {
		this.cod = cod;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getDuraction() {
		return duraction;
	}
	
	public void setDuraction(int duraction) {
		this.duraction = duraction;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Filme [Cod=" + cod + ", Titulo=" + title + ", Duracao=" + duraction + ", Preco=" + price
				+ ", Lancamento =" + date + "]";
	}
	
	
	
	
	

}
