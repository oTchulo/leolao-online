package com.projeto.leilao.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table(name = "item_leilao")
@Data
public class ItemLeilao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descricao;
	
	@Column(nullable = false, precision = 19, scale = 2)
	private BigDecimal valorAtual;
	private Long usuarioVencedorId;
	
	@Column(nullable = false)
	private LocalDateTime tempoFim;
	private long tempoRestanteSegundos;
	
	@Enumerated
	@Column(nullable = false)
	private StatusLeilao status;
	
	@Version
	private Long version;
	
	
	
	
}
