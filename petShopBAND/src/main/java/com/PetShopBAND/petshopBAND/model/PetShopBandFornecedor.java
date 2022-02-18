package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder 
@ToString
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
	
	//@ManyToOne
	//@Builder.Default
	//@JoinColumn(name="idprod")
	//private PetShopBandProduto petShopBandProdutoList;
	
	//@Builder.Default
	//@ManyToMany(mappedBy = "PetShopBandProduto", targetEntity = PetShopBandProduto.class)
	//private List<PetShopBandProduto> petShopBandProdutoList = new ArrayList<>();
}
