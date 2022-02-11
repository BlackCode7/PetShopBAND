package com.PetShopBAND.petshopBAND;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;
import com.PetShopBAND.petshopBAND.repository.PetShopBandClienteRepository;

@Component // Classe criada para instanciar o banco autmaticamente
@Transactional
public class PopulationBancPetShopBandInitial implements CommandLineRunner{
	
	@Autowired
	private PetShopBandClienteRepository clienteRepos;

	@Override
	public void run(String... args) throws Exception {
		
		//Instanciando o banco aqui		
		PetShopBandCliente cliente = new PetShopBandCliente(null, "Anders", null, null, null);
		cliente.setId(1);
		cliente.setNomeCliente("Anderson");
		cliente.setEndereco("endereço Anderson");
		cliente.setEmail("Anderson@Anderson.com");
		cliente.setTelefone("2199993333");
		
		PetShopBandCliente cliente2 = new PetShopBandCliente(null, "Anders", null, null, null);
		cliente2.setId(2);
		cliente2.setNomeCliente("Anderson2");
		cliente2.setEndereco("endereço2 Anderson2");
		cliente2.setEmail("Anderson2@Anderson2.com");
		cliente2.setTelefone("2299993333");
		
		// persistindo os dados no repositório Jpa
		clienteRepos.save(cliente);
		clienteRepos.save(cliente2);
		
	}

}
