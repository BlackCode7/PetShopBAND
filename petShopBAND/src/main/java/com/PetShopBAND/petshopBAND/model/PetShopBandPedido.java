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
@Table(name="PetShopBandPedido")
public class PetShopBandPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name="numero_itens", nullable = false)
	private Integer numeroItens;
	
	@Column(name="data_pedidoItens", nullable = false)
	private Date dataPedido; 
	
	@Column(name="nome_cliente_pedido", nullable = false)
	private String nomeClientePedido;//relacionar com o nome do cliente na tabela cliente
	
	@Column(name="nome_vendedor", nullable = false)
	private String nomeVendedor;//relacionar com o nome do vendedor na tabela vendedor


}
