package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandProdutoDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandProduto;

@RestController
public class PetShopBandProdutoController {

	@RequestMapping("/produtos")
	public List<PetShopBandProdutoDto> lista() {
		PetShopBandProduto produtos = new PetShopBandProduto();
		return PetShopBandProdutoDto.converter(Arrays.asList(produtos));
	}
}
