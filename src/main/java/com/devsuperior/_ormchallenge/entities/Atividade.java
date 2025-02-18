package com.devsuperior._ormchallenge.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    @OneToMany(mappedBy = "atividade")
    private Set<Bloco> blocos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();
}
