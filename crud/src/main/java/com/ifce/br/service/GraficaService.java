package com.ifce.br.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.data.GraficaRepository;
import com.ifce.br.model.Grafica;

@Service
public class GraficaService {

  @Autowired
  private GraficaRepository graficaRepository;

  public void cadastrarGraf(Grafica grafica) {
      graficaRepository.save(grafica);
  }

  public List<Grafica> listGrafica() {

    return graficaRepository.findAll();
  }
}
