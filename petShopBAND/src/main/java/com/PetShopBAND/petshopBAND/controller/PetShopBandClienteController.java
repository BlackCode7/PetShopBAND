package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandClienteDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

@RestController
public class PetShopBandClienteController {	
	
	@GetMapping("/listaClientes")
	public List<PetShopBandClienteDto> listaClientes(){
		PetShopBandCliente cliente = new PetShopBandCliente(null, null, null, null, null);
		return PetShopBandClienteDto.converter(Arrays.asList(cliente));
	}
}
