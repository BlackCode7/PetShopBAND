package com.PetShopBAND.petshopBAND.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PetShopBandVendedor{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idVendedor;
	private String nomeVendedor;
	
	public PetShopBandVendedor(UUID idVendedor, String nomeVendedor) {
		super();
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVendedor == null) ? 0 : idVendedor.hashCode());
		result = prime * result + ((nomeVendedor == null) ? 0 : nomeVendedor.hashCode());
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
		PetShopBandVendedor other = (PetShopBandVendedor) obj;
		if (idVendedor == null) {
			if (other.idVendedor != null)
				return false;
		} else if (!idVendedor.equals(other.idVendedor))
			return false;
		if (nomeVendedor == null) {
			if (other.nomeVendedor != null)
				return false;
		} else if (!nomeVendedor.equals(other.nomeVendedor))
			return false;
		return true;
	}
	public UUID getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(UUID idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	/* Relacionar com data de venda da tabela vendas */
	/* Relacionar com o nome do produto da tabela produto */
}
