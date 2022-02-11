package com.PetShopBAND.petshopBAND.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.PetShopBAND.petshopBAND.repository.PetShopBandClienteRepository;


@Controller
public class PetShopBandClienteController {
	
	@Autowired
	private PetShopBandClienteRepository clienteRepo;
	
	@GetMapping("/listagemClientes")
	public String listagemClientes(Model model) {
		model.addAttribute("listagemClientes", clienteRepo.findAll()) ;
		return "/listagemClientes";		
	}

}
