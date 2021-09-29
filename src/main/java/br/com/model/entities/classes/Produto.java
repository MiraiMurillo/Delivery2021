package br.com.model.entities.classes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.model.entities.interfaces.ProdutoInterface;

import java.util.ArrayList;

@Entity
public class Produto implements ProdutoInterface {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<ProdutoFornecedor> listaFornecedores;

    private boolean disponivel;

    public Produto(String nome) {
        setNome(nome);
        setDisponivel(true);
        setListaFornecedores(new ArrayList<ProdutoFornecedor>());
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "\n--Produto--\nID: " + getId() + "\nNome: " + getNome() + "\nLista de Fornecedores: "
                + getListaFornecedores().toString() + "\nDisponibilidade: " + isDisponivel();
    }

    public void adicionarFornecedor(ProdutoFornecedor produtoFornecedor) {
        produtoFornecedor.setProduto(this);
        getListaFornecedores().add(produtoFornecedor);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoFornecedor> getListaFornecedores() {
        return listaFornecedores;
    }

    public void setListaFornecedores(List<ProdutoFornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}