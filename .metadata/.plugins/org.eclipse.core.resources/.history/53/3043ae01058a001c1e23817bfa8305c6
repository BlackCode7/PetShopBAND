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
@Table(name="PetShopBandFornecedor")
public class PetShopBandFornecedor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idFornec;
	
	@Column(name="nome_fornec", nullable = false, length = 50)
	private String nomeFornec;
	
	@Column(name="telef_fornec", nullable = false, length = 20)
	private String telefFornec;
	
	@Column(name="email_fornec", nullable = false, length = 50)
	private String emailFornec;
	
	@Column(name="cnpj_fornec", nullable = false, length = 50)
	private Integer cnpjFornec;
	
	@Column(name="data_cadastro_fornec", nullable = false, length = 10)
	private Date dataCadastroFornec;
}
