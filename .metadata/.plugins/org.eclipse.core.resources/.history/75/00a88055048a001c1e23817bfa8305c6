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
@Table(name="PetShopBandVendedor")
public class PetShopBandVendedor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idVendedor;
	
	@Column(name="nome_vendedor", nullable = false, length = 50)
	private String nomeVendedor; //relacionar com tabela de vendedores
	
	@Column(name="soma_deVendas", nullable = false)
	private String somaVendasDoVendedor;//relacionar com tabela de vendas
	
	@Column(name="data_venda", nullable = false, length = 10)
	private Date dataVenda;
}
