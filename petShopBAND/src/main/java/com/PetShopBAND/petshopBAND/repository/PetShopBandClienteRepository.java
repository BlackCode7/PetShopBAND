package com.PetShopBAND.petshopBAND.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.PetShopBAND.petshopBAND.controller.dto.PetShopBandClienteDto;
import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

@Repository
public interface PetShopBandClienteRepository extends JpaRepository<PetShopBandCliente, Integer>{

//	PetShopBandCliente findAll(Integer id);
//	List<PetShopBandClienteDto> converte(List<PetShopBandCliente> asList);

}
