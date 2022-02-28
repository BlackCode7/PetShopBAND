package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_pedido")
public class PetShopBandPedido{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idped;
	private Integer itemped;
	private Date dataped; 	
	
	@ManyToOne
	@JoinColumn(name="id_cli")
	private PetShopBandCliente petShopBandCliente;
	
	public PetShopBandPedido() {
		super();
	}
	
	public UUID getidped() {
		return idped;
	}
	public void setidped(UUID idped) {
		this.idped = idped;
	}
	public Integer getitemped() {
		return itemped;
	}
	public void setitemped(Integer itemped) {
		this.itemped = itemped;
	}
	public Date getdataped() {
		return dataped;
	}
	public void setdataped(Date dataped) {
		this.dataped = dataped;
	}
	
}
