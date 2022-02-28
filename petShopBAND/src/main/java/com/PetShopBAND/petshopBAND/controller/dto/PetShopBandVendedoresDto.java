package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendedor;

public class PetShopBandVendedoresDto {

	private UUID idVendedor;
	private String nomeVendedor;
	
	public PetShopBandVendedoresDto(PetShopBandVendedor vendedor) {
		super();
		this.idVendedor = vendedor.getidvendedor();
		this.nomeVendedor = vendedor.getnomevendedor();
	}

	public UUID getIdVendedor() {
		return idVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	//Method
	public static List<PetShopBandVendedoresDto> converter(List<PetShopBandVendedor> vendedores) {
		return vendedores.stream().map(PetShopBandVendedoresDto::new).collect(Collectors.toList());
	}
		
}
