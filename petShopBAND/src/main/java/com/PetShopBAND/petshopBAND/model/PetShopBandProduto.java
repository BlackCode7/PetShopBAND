package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto")
public class PetShopBandProduto{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idprod;
	private String nomeprod;
	private String fabricanteprod;
	private Date datavalprod;
	private String descricaoproduto;
	private Double valorcustoproduto;
	private Double valorvendaproduto;
	
	@ManyToOne
	@JoinColumn(name="id_forn")
	private PetShopBandFornecedor petShopBandFornecedor;
	
	@ManyToOne
	@JoinColumn(name="id_cli")
	private PetShopBandCliente petShopBandCliente;
			
	public PetShopBandProduto() {
		super();
	}
	
	public UUID getidprod() {
		return idprod;
	}

	public void setidprod(UUID idprod) {
		this.idprod = idprod;
	}

	public String getnomeprod() {
		return nomeprod;
	}

	public void setnomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public String getfabricanteprod() {
		return fabricanteprod;
	}

	public void setfabricanteprod(String fabricanteprod) {
		this.fabricanteprod = fabricanteprod;
	}

	public Date getdatavalprod() {
		return datavalprod;
	}

	public void setdatavalprod(Date datavalprod) {
		this.datavalprod = datavalprod;
	}

	public String getdescricaoproduto() {
		return descricaoproduto;
	}

	public void setdescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public Double getvalorcustoproduto() {
		return valorcustoproduto;
	}

	public void setvalorcustoproduto(Double valorcustoproduto) {
		this.valorcustoproduto = valorcustoproduto;
	}

	public Double getvalorvendaproduto() {
		return valorvendaproduto;
	}

	public void setvalorvendaproduto(Double valorvendaproduto) {
		this.valorvendaproduto = valorvendaproduto;
	}	
	
}
