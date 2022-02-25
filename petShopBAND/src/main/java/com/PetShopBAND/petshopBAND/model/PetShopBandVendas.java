package com.PetShopBAND.petshopBAND.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PetShopBandVendas{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idVenda;
	private Date dataVenda;
	
	public PetShopBandVendas(UUID idVenda, Date dataVenda) {
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataVenda == null) ? 0 : dataVenda.hashCode());
		result = prime * result + ((idVenda == null) ? 0 : idVenda.hashCode());
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
		PetShopBandVendas other = (PetShopBandVendas) obj;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (idVenda == null) {
			if (other.idVenda != null)
				return false;
		} else if (!idVenda.equals(other.idVenda))
			return false;
		return true;
	}
	public UUID getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(UUID idVenda) {
		this.idVenda = idVenda;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
		
	/* relacionar com o nome do vendedor */
	
	/* relacionar com o nome do produto */
	
	/* relacionar com a quantidade de itens vendidos */
	
	/* relacionar com o nome do cliente */
}
