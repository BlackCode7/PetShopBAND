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
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="TB_Pedido")
public class PetShopBandPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idped")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idPed;
	
	@Column(name="numeroped", nullable = false)
	private Integer itemPed;
	
	@Column(name="dataped", nullable = false)
	private Date dataPed; 
	
	@Column(name="nomeclienteped", nullable = false)
	private String nomeClientePed;//relacionar com o nome do cliente na tabela cliente
	
	@Column(name="nomevendedorped", nullable = false)
	private String nomeVendedorPed;//relacionar com o nome do vendedor na tabela vendedor


}
