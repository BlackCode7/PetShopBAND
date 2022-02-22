package com.PetShopBAND.petshopBAND.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandPedidoDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandPedido;

@RestController
public class PetShopBandPedidoController {

	@RequestMapping("/pedidos")
	public List<PetShopBandPedidoDto> lista() {
		PetShopBandPedido pedidos = new PetShopBandPedido(null, null, null, null);
		return PetShopBandPedidoDto.converter(Arrays.asList(pedidos));
	}

}
