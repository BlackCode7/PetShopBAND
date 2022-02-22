package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandVendasDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandVendas;

@RestController
public class PetShopBandVendasController {

	@RequestMapping("/vendas")
	public List<PetShopBandVendasDto> lista() {
		PetShopBandVendas vendas = new PetShopBandVendas(null, null);
		return PetShopBandVendasDto.converter(Arrays.asList(vendas));
	}
}
