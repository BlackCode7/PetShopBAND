package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="TB_Fornecedor")
public class PetShopBandFornecedor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idforn")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idForn;
	
	@Column(name="nomeforn", nullable = false, length = 50)
	private String nomeFornec;
	
	@Column(name="telefforn", nullable = false, length = 20)
	private String telefFornec;
	
	@Column(name="emailforn", nullable = false, length = 50)
	private String emailFornec;
	
	@Column(name="cnpjforn", nullable = false, length = 50)
	private Long cnpjFornec;
	
	@Column(name="dataforn", nullable = false)	
	private String  dataFornec;
}
