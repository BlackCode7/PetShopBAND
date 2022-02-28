package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandFornecedor;

public class PetShopBandFornecedorDto{

	private UUID idForn;
	private String nomeFornec;
	private String telefFornec;
	private String emailFornec;
	private Long cnpjFornec;
	private String  dataFornec;
	
	public PetShopBandFornecedorDto(PetShopBandFornecedor petShopBandFornecedor) {
		this.idForn = petShopBandFornecedor.getIdForn();
		this.nomeFornec = petShopBandFornecedor.getnomefornec();
		this.telefFornec = petShopBandFornecedor.getteleffornec();
		this.emailFornec = petShopBandFornecedor.getemailfornec();
		this.cnpjFornec = petShopBandFornecedor.getcnpjfornec();
		this.dataFornec = petShopBandFornecedor.getdatafornec();
	}
	public UUID getIdForn() {
		return idForn;
	}
	public String getNomeFornec() {
		return nomeFornec;
	}
	public String getTelefFornec() {
		return telefFornec;
	}
	public String getEmailFornec() {
		return emailFornec;
	}
	public Long getCnpjFornec() {
		return cnpjFornec;
	}
	public String getDataFornec() {
		return dataFornec;
	}
	
	// Method
	public static List<PetShopBandFornecedorDto> converter(List<PetShopBandFornecedor> fornecedores) {
		return fornecedores.stream().map(PetShopBandFornecedorDto::new).collect(Collectors.toList());
	}
	
}
