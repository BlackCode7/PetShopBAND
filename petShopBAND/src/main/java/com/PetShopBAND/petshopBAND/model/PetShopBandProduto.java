package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="TB_Produto")
public class PetShopBandProduto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idprod")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProd;
	
	@Column(name="nomeprod", nullable = false, length = 50)
	private String nomeProd;
	
	@Column(name="nomefabrprod", nullable = true, length = 50)
	private String fabricanteProd;
	
	@Column(name="datavalidprod", nullable = false, length = 10)
	private Date dataValProd;
	
	@Column(name="descricaoprod", nullable = true, length = 200)
	private String descricaoProduto;

}
