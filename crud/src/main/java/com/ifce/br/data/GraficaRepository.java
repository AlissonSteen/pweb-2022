package com.ifce.br.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Grafica;

@Repository
public interface GraficaRepository extends JpaRepository<Grafica, Long>{
  
}
