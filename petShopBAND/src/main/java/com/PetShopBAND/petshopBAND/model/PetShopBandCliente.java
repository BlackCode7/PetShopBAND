package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;

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
@Table(name="PetShopBandCliente ")
public class PetShopBandCliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome_cliente", nullable = false, length = 50)
	private String nomeCliente;
	
	@Column(name="cliente_endereco", nullable = false, length = 200)
	private String endereco;
	
	@Column(name="cliente_email", nullable = false, length = 50)
	private String email;
	
	@Column(name="cliente_telefone", nullable = false, length = 50)
	private String telefone;

}
