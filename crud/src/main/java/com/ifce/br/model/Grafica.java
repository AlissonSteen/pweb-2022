package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grafica {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  
  private Long id;
  private String material;
  private String fabricante;
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  
  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getFabricante() {
    return fabricante;
  }
}
