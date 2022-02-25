package com.PetShopBAND.petshopBAND.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PetShopBandFornecedor{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID idForn;
	private String nomeFornec;
	private String telefFornec;
	private String emailFornec;
	private Long cnpjFornec;
	private String  dataFornec;
		
	@OneToMany
	private List<PetShopBandProduto> petShopBandProduto = new ArrayList<PetShopBandProduto>();		
		
	public PetShopBandFornecedor() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjFornec == null) ? 0 : cnpjFornec.hashCode());
		result = prime * result + ((dataFornec == null) ? 0 : dataFornec.hashCode());
		result = prime * result + ((emailFornec == null) ? 0 : emailFornec.hashCode());
		result = prime * result + ((idForn == null) ? 0 : idForn.hashCode());
		result = prime * result + ((nomeFornec == null) ? 0 : nomeFornec.hashCode());
		result = prime * result + ((telefFornec == null) ? 0 : telefFornec.hashCode());
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
		PetShopBandFornecedor other = (PetShopBandFornecedor) obj;
		if (cnpjFornec == null) {
			if (other.cnpjFornec != null)
				return false;
		} else if (!cnpjFornec.equals(other.cnpjFornec))
			return false;
		if (dataFornec == null) {
			if (other.dataFornec != null)
				return false;
		} else if (!dataFornec.equals(other.dataFornec))
			return false;
		if (emailFornec == null) {
			if (other.emailFornec != null)
				return false;
		} else if (!emailFornec.equals(other.emailFornec))
			return false;
		if (idForn == null) {
			if (other.idForn != null)
				return false;
		} else if (!idForn.equals(other.idForn))
			return false;
		if (nomeFornec == null) {
			if (other.nomeFornec != null)
				return false;
		} else if (!nomeFornec.equals(other.nomeFornec))
			return false;
		if (telefFornec == null) {
			if (other.telefFornec != null)
				return false;
		} else if (!telefFornec.equals(other.telefFornec))
			return false;
		return true;
	}
	public UUID getIdForn() {
		return idForn;
	}
	public void setIdForn(UUID idForn) {
		this.idForn = idForn;
	}
	public String getNomeFornec() {
		return nomeFornec;
	}
	public void setNomeFornec(String nomeFornec) {
		this.nomeFornec = nomeFornec;
	}
	public String getTelefFornec() {
		return telefFornec;
	}
	public void setTelefFornec(String telefFornec) {
		this.telefFornec = telefFornec;
	}
	public String getEmailFornec() {
		return emailFornec;
	}
	public void setEmailFornec(String emailFornec) {
		this.emailFornec = emailFornec;
	}
	public Long getCnpjFornec() {
		return cnpjFornec;
	}
	public void setCnpjFornec(Long cnpjFornec) {
		this.cnpjFornec = cnpjFornec;
	}
	public String getDataFornec() {
		return dataFornec;
	}
	public void setDataFornec(String dataFornec) {
		this.dataFornec = dataFornec;
	}
}
