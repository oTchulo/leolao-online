package com.projeto.leilao.repository;



import com.projeto.leilao.model.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {


    List<Lance> findByItemIdOrderByValorDescDataAsc(Long itemId);


    Optional<Lance> findTopByItemIdOrderByValorDesc(Long itemId);


    Optional<Lance> findTopByItemIdOrderByDataDesc(Long itemId);
}

