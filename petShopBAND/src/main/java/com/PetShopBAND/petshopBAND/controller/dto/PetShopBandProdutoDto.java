package com.PetShopBAND.petshopBAND.controller.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.PetShopBAND.petshopBAND.model.PetShopBandProduto;

public class PetShopBandProdutoDto {

	private UUID idProd;
	private String nomeProd;
	private String fabricanteProd;
	private Date dataValProd;
	private String descricaoProduto;
	private Double valorCustoProduto;
	private Double valorVendaProduto;
	
	public PetShopBandProdutoDto(PetShopBandProduto petShopBandProduto) {
		super();
		this.idProd = petShopBandProduto.getidprod();
		this.nomeProd = petShopBandProduto.getnomeprod();
		this.fabricanteProd = petShopBandProduto.getfabricanteprod();
		this.dataValProd = petShopBandProduto.getdatavalprod();
		this.descricaoProduto = petShopBandProduto.getdescricaoproduto();
		this.valorCustoProduto = petShopBandProduto.getvalorcustoproduto();
		this.valorVendaProduto = petShopBandProduto.getvalorvendaproduto();
	}

	public UUID getIdProd() {
		return idProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public String getFabricanteProd() {
		return fabricanteProd;
	}

	public Date getDataValProd() {
		return dataValProd;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public Double getValorCustoProduto() {
		return valorCustoProduto;
	}

	public Double getValorVendaProduto() {
		return valorVendaProduto;
	}

	//Method
	public static List<PetShopBandProdutoDto> converter(List<PetShopBandProduto> produtos) {
		return produtos.stream().map(PetShopBandProdutoDto::new).collect(Collectors.toList());
	}
	
}
