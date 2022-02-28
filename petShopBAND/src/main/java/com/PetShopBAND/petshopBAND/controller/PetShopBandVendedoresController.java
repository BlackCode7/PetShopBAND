package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandVendedoresDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandVendedor;

@RestController
public class PetShopBandVendedoresController {

	@RequestMapping("/vendedores")
	public List<PetShopBandVendedoresDto> lista() {
		PetShopBandVendedor vendedores = new PetShopBandVendedor();
		return PetShopBandVendedoresDto.converter(Arrays.asList(vendedores));
	}
}
