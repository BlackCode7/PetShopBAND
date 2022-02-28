package com.PetShopBAND.petshopBAND.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_vendedor")
public class PetShopBandVendedor{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idvendedor;
	private String nomevendedor;	
	
	
	public PetShopBandVendedor() {
		super();
	}	
	
	public UUID getidvendedor() {
		return idvendedor;
	}
	public void setidvendedor(UUID idvendedor) {
		this.idvendedor = idvendedor;
	}
	public String getnomevendedor() {
		return nomevendedor;
	}
	public void setnomevendedor(String nomevendedor) {
		this.nomevendedor = nomevendedor;
	}
	/* Relacionar com data de venda da tabela vendas */
	/* Relacionar com o nome do produto da tabela produto */
}
