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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name="TB_Venda")
public class PetShopBandVendas implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idvenda")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idVenda;
	
	@Column(name="datavenda", nullable = false)
	private Date dataVenda;
	
	/* relacionar com o nome do vendedor */
	
	/* relacionar com o nome do produto */
	
	/* relacionar com a quantidade de itens vendidos */
	
	/* relacionar com o nome do cliente */
}
