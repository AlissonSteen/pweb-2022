package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Grafica;
import com.ifce.br.service.GraficaService;

@Controller
public class GraficaController {	
	
	@Autowired
	private GraficaService graficaService;

	@GetMapping("/grafica/form")
	public String HomePage() {
		return "Form";
	}

	@PostMapping("/grafica/salvar")
	public String cadastrarGraf(Grafica grafica) {
		
		graficaService.cadastrarGraf(grafica);
	
		return "Confirm";
	}

	@GetMapping("/grafica/listar")
	public ModelAndView listarGrafica() {

		List<Grafica> grafica = graficaService.listGrafica();
		ModelAndView v = new ModelAndView("List");

		v.addObject("listGrafica", grafica);
		return v;
	}
	
}
