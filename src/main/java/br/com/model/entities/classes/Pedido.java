package br.com.model.entities.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.model.entities.interfaces.PedidoInterface;

@Entity
public class Pedido implements PedidoInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itensPedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_forma_pagamento")
    private FormaPagamento formaPagamento;

    private Float desconto;
    private Boolean pago;
    private Boolean entregue;
    private Date data;

    public Pedido(Cliente cliente, FormaPagamento formaPagamento, Float desconto, Boolean pago, Boolean entregue) {
        setCliente(cliente);
        setFormaPagamento(formaPagamento);
        setDesconto(desconto);
        setPago(pago);
        setEntregue(entregue);
        setItensPedido(new ArrayList<>());
        setData(new Date());
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "\n-- Pedido -- \nID: " + getId() + "\nData: " + getData() + "\nDesconto: " + getDesconto()
                + "\nEntregue: " + getEntregue() + getItensPedido() + getFormaPagamento() + "\nPago: " + getPago()
                + getCliente(); // getAvaliacao();
    }

    @Override
    public Float calculaValorTotal() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean statusEntrega(int idPedido) {
        // TODO Auto-generated method stub
        return false;
    }

    public void addItemPedido(ItemPedido itemPedido) {
        getItensPedido().add(itemPedido);
    }

    public void removerItemPedido(ItemPedido itemPedido) {
        getItensPedido().remove(itemPedido);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Boolean getEntregue() {
        return entregue;
    }

    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}