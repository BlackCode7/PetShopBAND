package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

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
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}

	public static List<PetShopBandClienteDto> converter(List<PetShopBandCliente> clientes) {
		return clientes.stream().map(PetShopBandClienteDto::new).collect(Collectors.toList());
	}
}
