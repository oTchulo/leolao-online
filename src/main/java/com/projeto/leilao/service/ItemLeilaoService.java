package com.projeto.leilao.service;

import com.projeto.leilao.model.ItemLeilao;
import com.projeto.leilao.repository.ItemLeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ItemLeilaoService {

    @Autowired
    private ItemLeilaoRepository itemLeilaoRepository;

    public ItemLeilao buscarPorId(Long itemId) {
        return itemLeilaoRepository.findById(itemId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item de leilão não encontrado com ID: " + itemId));
    }
    
    public ItemLeilao atualizar(ItemLeilao item) {

        if (item.getStatus() == ItemLeilao.StatusLeilao.ABERTO && LocalDateTime.now().isAfter(item.getTempoFim())) {
            item.setStatus(ItemLeilao.StatusLeilao.ENCERRADO);
        }

        return itemLeilaoRepository.save(item);
    }


    public List<ItemLeilao> listarTodos() {
        return itemLeilaoRepository.findAll();
    }
}
