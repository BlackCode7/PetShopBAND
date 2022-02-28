package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendas;

public class PetShopBandVendasDto {

	private UUID idVenda;
	private Date dataVenda;
	
	public PetShopBandVendasDto(PetShopBandVendas petShopBandVendas) {
		super();
		this.idVenda = petShopBandVendas.getidvenda();
		this.dataVenda = petShopBandVendas.getdatavenda();
	}

	public UUID getIdVenda() {
		return idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	//Method
	public static List<PetShopBandVendasDto> converter(List<PetShopBandVendas> vendas) {
		return vendas.stream().map(PetShopBandVendasDto::new).collect(Collectors.toList());
	}	
}
