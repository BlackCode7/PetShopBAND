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
@Table(name="PetShopBandProduto")
public class PetShopBandProduto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name="nome_produto", nullable = false, length = 50)
	private String nomeProduto;
	
	@Column(name="nome_fabricante", nullable = true, length = 50)
	private String fabricante;
	
	@Column(name="data_validade", nullable = false, length = 10)
	private Date dataValidade;
	
	@Column(name="descricao_produto", nullable = true, length = 200)
	private String descricaoProduto;

}
