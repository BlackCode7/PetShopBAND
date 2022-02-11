package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PetShopBAND.petshopBAND.model.PetShopBandProduto;

@Repository
public interface PetShopBandProdutoRepository extends JpaRepository<PetShopBandProduto, UUID>{

}
