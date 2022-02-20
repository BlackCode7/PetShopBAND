package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PetShopBandClienteDto {

	private Integer id;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	
	public PetShopBandClienteDto(PetShopBandCliente petShopBandCliente) {
		this.id = petShopBandCliente.getId();
		this.nome = petShopBandCliente.getNome();
		this.endereco = petShopBandCliente.getEndereco();
		this.email = petShopBandCliente.getEmail();
		this.telefone = petShopBandCliente.getTelefone();
	}

	//Methodo for convert in PetShopBandClienteDto
	public static Object converte(List<PetShopBandCliente> petShopBandCliente) {
		return petShopBandCliente.stream().map(PetShopBandClienteDto::new).collect(Collectors.toList());
	}
	
}
