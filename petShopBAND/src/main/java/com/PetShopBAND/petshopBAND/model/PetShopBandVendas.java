package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_venda")
public class PetShopBandVendas{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idvenda;
	private Date datavenda;
	
	public PetShopBandVendas() {
		super();
	}
	
	public UUID getidvenda() {
		return idvenda;
	}
	public void setidvenda(UUID idvenda) {
		this.idvenda = idvenda;
	}
	public Date getdatavenda() {
		return datavenda;
	}
	public void setdatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}
		
	/* relacionar com o nome do vendedor */
	
	/* relacionar com o nome do produto */
	
	/* relacionar com a quantidade de itens vendidos */
	
	/* relacionar com o nome do cliente */
}
