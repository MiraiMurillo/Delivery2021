package br.com.test.model.classes;

import br.com.model.entities.classes.Avaliacao;
import br.com.model.entities.classes.Cliente;
import br.com.model.entities.classes.FormaPagamento;
import br.com.model.entities.classes.ItemPedido;
import br.com.model.entities.classes.Pedido;
import br.com.model.entities.classes.Produto;

public class testeAvaliacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("NomeClienteTeste", "000.000.000-00", "teste@gmail.com", "teste123456");
        FormaPagamento formaPagamento = new FormaPagamento("Débito");
        Pedido pedido = new Pedido(cliente, formaPagamento, 7.00f, false, false);

        Produto produto = new Produto("abacate");
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 5);

        Avaliacao avaliacao = new Avaliacao(5, itemPedido, "teste de comentário");

        System.out.println(avaliacao.toString());
        System.out.println(pedido.toString());
    }
}
