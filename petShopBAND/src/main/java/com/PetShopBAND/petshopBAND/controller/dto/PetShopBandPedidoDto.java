package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandPedido;

public class PetShopBandPedidoDto {

	private UUID idPed;
	private Integer itemPed;
	private Date dataPed; 
	
	public PetShopBandPedidoDto(PetShopBandPedido petShopBandPedido) {
		this.idPed = petShopBandPedido.getIdPed();
		this.itemPed = petShopBandPedido.getItemPed();
		this.dataPed = petShopBandPedido.getDataPed();
	}

	public UUID getIdPed() {
		return idPed;
	}

	public Integer getItemPed() {
		return itemPed;
	}

	public Date getDataPed() {
		return dataPed;
	}

	//Method
	public static List<PetShopBandPedidoDto> converter(List<PetShopBandPedido> pedidos) {
		return pedidos.stream().map(PetShopBandPedidoDto::new).collect(Collectors.toList());
	}	
}
