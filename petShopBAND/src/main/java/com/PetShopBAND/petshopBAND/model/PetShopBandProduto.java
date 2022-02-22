package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;


public class PetShopBandProduto{
	
	private UUID idProd;
	private String nomeProd;
	private String fabricanteProd;
	private Date dataValProd;
	private String descricaoProduto;
	private Double valorCustoProduto;
	private Double valorVendaProduto;
	
	public PetShopBandProduto(UUID idProd, String nomeProd, String fabricanteProd, Date dataValProd,
			String descricaoProduto, Double valorCustoProduto, Double valorVendaProduto) {
		super();
		this.idProd = idProd;
		this.nomeProd = nomeProd;
		this.fabricanteProd = fabricanteProd;
		this.dataValProd = dataValProd;
		this.descricaoProduto = descricaoProduto;
		this.valorCustoProduto = valorCustoProduto;
		this.valorVendaProduto = valorVendaProduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataValProd == null) ? 0 : dataValProd.hashCode());
		result = prime * result + ((descricaoProduto == null) ? 0 : descricaoProduto.hashCode());
		result = prime * result + ((fabricanteProd == null) ? 0 : fabricanteProd.hashCode());
		result = prime * result + ((idProd == null) ? 0 : idProd.hashCode());
		result = prime * result + ((nomeProd == null) ? 0 : nomeProd.hashCode());
		result = prime * result + ((valorCustoProduto == null) ? 0 : valorCustoProduto.hashCode());
		result = prime * result + ((valorVendaProduto == null) ? 0 : valorVendaProduto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetShopBandProduto other = (PetShopBandProduto) obj;
		if (dataValProd == null) {
			if (other.dataValProd != null)
				return false;
		} else if (!dataValProd.equals(other.dataValProd))
			return false;
		if (descricaoProduto == null) {
			if (other.descricaoProduto != null)
				return false;
		} else if (!descricaoProduto.equals(other.descricaoProduto))
			return false;
		if (fabricanteProd == null) {
			if (other.fabricanteProd != null)
				return false;
		} else if (!fabricanteProd.equals(other.fabricanteProd))
			return false;
		if (idProd == null) {
			if (other.idProd != null)
				return false;
		} else if (!idProd.equals(other.idProd))
			return false;
		if (nomeProd == null) {
			if (other.nomeProd != null)
				return false;
		} else if (!nomeProd.equals(other.nomeProd))
			return false;
		if (valorCustoProduto == null) {
			if (other.valorCustoProduto != null)
				return false;
		} else if (!valorCustoProduto.equals(other.valorCustoProduto))
			return false;
		if (valorVendaProduto == null) {
			if (other.valorVendaProduto != null)
				return false;
		} else if (!valorVendaProduto.equals(other.valorVendaProduto))
			return false;
		return true;
	}

	public UUID getIdProd() {
		return idProd;
	}

	public void setIdProd(UUID idProd) {
		this.idProd = idProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getFabricanteProd() {
		return fabricanteProd;
	}

	public void setFabricanteProd(String fabricanteProd) {
		this.fabricanteProd = fabricanteProd;
	}

	public Date getDataValProd() {
		return dataValProd;
	}

	public void setDataValProd(Date dataValProd) {
		this.dataValProd = dataValProd;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getValorCustoProduto() {
		return valorCustoProduto;
	}

	public void setValorCustoProduto(Double valorCustoProduto) {
		this.valorCustoProduto = valorCustoProduto;
	}

	public Double getValorVendaProduto() {
		return valorVendaProduto;
	}

	public void setValorVendaProduto(Double valorVendaProduto) {
		this.valorVendaProduto = valorVendaProduto;
	}	
	
}
