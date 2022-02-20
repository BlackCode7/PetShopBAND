package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandClienteDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;
import com.PetShopBAND.petshopBAND.repository.PetShopBandClienteRepository;


@RestController
public class PetShopBandClienteController {
	
	@Autowired
	private PetShopBandClienteRepository petShopBandClienteRepository;	
	
	@GetMapping("/listaClientes")
	public List<PetShopBandClienteDto> listaClientes(@PathVariable Integer id){
		PetShopBandCliente cliente = new PetShopBandCliente(1,"nome1","enderecoCLI","emailCLI@","123451234", null, null);
		return petShopBandClienteRepository.converte(Arrays.asList(cliente));
	}
	
	
//	@GetMapping("/listaClientes")
//	public List<PetShopBandClienteDto> listaClientes(@PathVariable Integer id){
//		PetShopBandCliente cliente = new PetShopBandCliente(1,"nome1","enderecoCLI","emailCLI@","123451234", null, null);
//		return PetShopBandClienteDto.converte(Arrays.asList(cliente));
//	}

}
