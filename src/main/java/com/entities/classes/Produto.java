package com.entities.classes;

import java.util.List;

import com.entities.interfaces.ProdutoInterface;

public class Produto implements ProdutoInterface {

    private int id;
    private String nome;
    private List<ProdutoFornecedor> listaFornecedores;
    private boolean disponivel;

    public Produto(String nome) {
        setNome(nome);
        setDisponivel(true);
    }

    @Override
    public String toString() {
        return "\n--Produto--\nID: " + getId() + "\nNome: " + getNome() + "\nFornecedor: " + getNomeDoFornecedor()
                + "\nDisponibilidade: " + getDisponivel();
    }

    private String getNomeDoFornecedor() {
        return null;
    }

    // Getters/Setters

    public int getId() {
        return id;
    }

    public List<ProdutoFornecedor> getListaFornecedores() {
        return listaFornecedores;
    }

    public void setListaFornecedores(List<ProdutoFornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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
}
