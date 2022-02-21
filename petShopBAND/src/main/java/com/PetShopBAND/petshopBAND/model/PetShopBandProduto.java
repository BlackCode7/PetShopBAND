package com.PetShopBAND.petshopBAND.model;

import java.io.Serializable;
import java.util.Date;
//import java.util.List;
import java.util.UUID;

//import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="TB_Produto")
public class PetShopBandProduto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Type(type = "uuid-char")
	@Column(name="idprod", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProd;
	
	@Column(name="nomeprod", nullable = false, length = 200)//, nullable = false, length = 50
	private String nomeProd;
	
	@Column(name="nomefabrprod", nullable = true, length = 200)
	private String fabricanteProd;
	
	@Column(name="datavalidprod", nullable = false)
	private Date dataValProd;
	
	@Column(name="descricaoprod", nullable = true)
	private String descricaoProduto;
	
	@Column(name="valorcustoprod", nullable = true)
	private Double valorCustoProduto;
	
	@Column(name="valorvendaprod", nullable = true)
	private Double valorVendaProduto;
	
	/* Relacionamento das classes */
//	@ManyToOne
//	private PetShopBandPedido PetShopBandPedido;
	
//	@ManyToOne
//	private PetShopBandFornecedor petShopBandFornecedor;	
//	
//	@ManyToOne
//	private PetShopBandCliente petShopBandCliente;
	
	//@Builder.Default
	//@ManyToMany(mappedBy = "PetShopBandFornecedor", targetEntity = PetShopBandFornecedor.class)
	//private List<PetShopBandFornecedor> petShopBandFornecedorList = new ArrayList<>();	

}
