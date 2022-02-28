package com.PetShopBAND.petshopBAND.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class PetShopBandCliente {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cli;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	
	@OneToMany
	private List<PetShopBandPedido> petShopBandPedido = new ArrayList<PetShopBandPedido>();
	
	@OneToMany
	private List<PetShopBandProduto> petShopBandProduto = new ArrayList<PetShopBandProduto>();
	
	public PetShopBandCliente() {
		super();
	}
	
	public Integer getId() {
		return id_cli;
	}
	public void setId(Integer id) {
		this.id_cli = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
