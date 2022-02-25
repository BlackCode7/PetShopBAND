package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandFornecedorDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandFornecedor;


@RestController
public class PetShopBandFornecedorController {

	@RequestMapping("/fornecedores")
	public List<PetShopBandFornecedorDto> lista() {
		PetShopBandFornecedor fornecedores = new PetShopBandFornecedor();
		return PetShopBandFornecedorDto.converter(Arrays.asList(fornecedores));
	}
}
