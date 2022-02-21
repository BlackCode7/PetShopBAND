package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="TB_Pedido")
public class PetShopBandPedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Type(type = "uuid-char")
	@Column(name="idped", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idPed;
	
	@Column(name="numeroped", nullable = false)
	private Integer itemPed;
	
	@Column(name="dataped", nullable = false)
	private Date dataPed; 	
	
	// Tabela produto
	@ManyToOne
	@JoinColumn(name="")
	private PetShopBandProduto petShopBandProduto;
	
	// Tabela Clientes
	//@OneToMany
//	@ManyToOne(fetch=FetchType.LAZY)
//	private PetShopBandCliente petShopBandCliente;
	
	
	
//	@Column(name="nomeclienteped", nullable = false)
//	private String nomeClientePed;//relacionar com o nome do cliente na tabela cliente
//	
//	@Column(name="nomevendedorped", nullable = false)
//	private String nomeVendedorPed;//relacionar com o nome do vendedor na tabela vendedor


}
