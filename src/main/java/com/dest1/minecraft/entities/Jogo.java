package com.dest1.minecraft.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jogo {
    @Id
    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private int anoLancamento;
    private String imagem;
    private String descricao;

    public Jogo(){
    }

    public Jogo(int id, String nome, String plataforma, String genero, int anoLancamento, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.plataforma = plataforma;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
