package com.projeto.leilao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.leilao.model.ItemLeilao;

public interface ItemLeilaoRepository extends JpaRepository<ItemLeilao, Long> {
}
