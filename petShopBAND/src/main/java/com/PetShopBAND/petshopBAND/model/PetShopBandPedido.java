package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PetShopBandPedido{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idPed;
	private Integer itemPed;
	private Date dataPed; 	
	private PetShopBandProduto petShopBandProduto;
	
	public PetShopBandPedido(UUID idPed, Integer itemPed, Date dataPed, PetShopBandProduto petShopBandProduto) {
		super();
		this.idPed = idPed;
		this.itemPed = itemPed;
		this.dataPed = dataPed;
		this.petShopBandProduto = petShopBandProduto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataPed == null) ? 0 : dataPed.hashCode());
		result = prime * result + ((idPed == null) ? 0 : idPed.hashCode());
		result = prime * result + ((itemPed == null) ? 0 : itemPed.hashCode());
		result = prime * result + ((petShopBandProduto == null) ? 0 : petShopBandProduto.hashCode());
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
		PetShopBandPedido other = (PetShopBandPedido) obj;
		if (dataPed == null) {
			if (other.dataPed != null)
				return false;
		} else if (!dataPed.equals(other.dataPed))
			return false;
		if (idPed == null) {
			if (other.idPed != null)
				return false;
		} else if (!idPed.equals(other.idPed))
			return false;
		if (itemPed == null) {
			if (other.itemPed != null)
				return false;
		} else if (!itemPed.equals(other.itemPed))
			return false;
		if (petShopBandProduto == null) {
			if (other.petShopBandProduto != null)
				return false;
		} else if (!petShopBandProduto.equals(other.petShopBandProduto))
			return false;
		return true;
	}
	public UUID getIdPed() {
		return idPed;
	}
	public void setIdPed(UUID idPed) {
		this.idPed = idPed;
	}
	public Integer getItemPed() {
		return itemPed;
	}
	public void setItemPed(Integer itemPed) {
		this.itemPed = itemPed;
	}
	public Date getDataPed() {
		return dataPed;
	}
	public void setDataPed(Date dataPed) {
		this.dataPed = dataPed;
	}
	public PetShopBandProduto getPetShopBandProduto() {
		return petShopBandProduto;
	}
	public void setPetShopBandProduto(PetShopBandProduto petShopBandProduto) {
		this.petShopBandProduto = petShopBandProduto;
	}
	
}
