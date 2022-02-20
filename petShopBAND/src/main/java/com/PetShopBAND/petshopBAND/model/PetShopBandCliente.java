package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="TB_Cliente")
public class PetShopBandCliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Type(type = "uuid-char")
	@Column(name="idcli", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nomecli", nullable = false, length = 200)
	private String nome;
	
	@Column(name="enderecocli", nullable = false, length = 200)
	private String endereco;
	
	@Column(name="emailcli", nullable = false, length = 200)
	private String email;
	
	@Column(name="telefonecli", nullable = false, length = 50)
	private String telefone;
	
	//Tabela Pedidos
	@OneToMany(targetEntity = PetShopBandPedido.class, cascade=CascadeType.ALL)
	@JoinColumn(name="idped", referencedColumnName = "idcli")
	private List<PetShopBandPedido> petShopBandPedido;
	
	//Tabela produto
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idprod", table="TB_Produto")
	private List<PetShopBandProduto> petShopBandProdutoList;

}
