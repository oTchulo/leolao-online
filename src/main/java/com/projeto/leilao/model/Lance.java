package com.projeto.leilao.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "lance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDateTime data = LocalDateTime.now();

    @Column(nullable = false)
    private Long itemId;

    @Column(nullable = false)
    private Long usuarioId;

    @Version
    private Long version;
}
