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
@Table(name="TB_Vendedor")
public class PetShopBandVendedor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idvendedor")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idVendedor;
	
	@Column(name="nomevendedor", nullable = false, length = 50)
	private String nomeVendedor; //relacionar com tabela de vendedores
		
	/* Relacionar com data de venda da tabela vendas */
	/* Relacionar com o nome do produto da tabela produto */
}
