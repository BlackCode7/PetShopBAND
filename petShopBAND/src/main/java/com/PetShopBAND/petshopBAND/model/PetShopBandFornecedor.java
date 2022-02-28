package com.PetShopBAND.petshopBAND.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_fornecedor")
public class PetShopBandFornecedor{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id_forn;
	private String nomefornec;
	private String teleffornec;
	private String emailfornec;
	private Long cnpjfornec;
	private String  datafornec;
		
	@OneToMany
	private List<PetShopBandProduto> petShopBandProduto = new ArrayList<PetShopBandProduto>();
	
	public PetShopBandFornecedor() {
		super();
	}
	
	public UUID getIdForn() {
		return id_forn;
	}
	public void setIdForn(UUID idForn) {
		this.id_forn = idForn;
	}
	public String getnomefornec() {
		return nomefornec;
	}
	public void setnomefornec(String nomefornec) {
		this.nomefornec = nomefornec;
	}
	public String getteleffornec() {
		return teleffornec;
	}
	public void setteleffornec(String teleffornec) {
		this.teleffornec = teleffornec;
	}
	public String getemailfornec() {
		return emailfornec;
	}
	public void setemailfornec(String emailfornec) {
		this.emailfornec = emailfornec;
	}
	public Long getcnpjfornec() {
		return cnpjfornec;
	}
	public void setcnpjfornec(Long cnpjfornec) {
		this.cnpjfornec = cnpjfornec;
	}
	public String getdatafornec() {
		return datafornec;
	}
	public void setdatafornec(String datafornec) {
		this.datafornec = datafornec;
	}
}
