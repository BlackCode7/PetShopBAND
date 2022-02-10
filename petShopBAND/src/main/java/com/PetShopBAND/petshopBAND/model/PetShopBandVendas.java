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
@Table(name="PetShopBand_Vendas")
public class PetShopBandVendas implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idVendas;
	
	@Column(name="nome_vendedor", nullable = false)
	private String nomeVendedor; // relacionar com a classe vendedor
	
	@Column(name="nome_cliente", nullable = false)
	private String pedidoCliente; // Relacionar com a classe clientes
	
	@Column(name="nome_venda", nullable = false)
	private Date dataVenda;
}
