package com.test;

import com.entities.classes.Cliente;
import com.entities.classes.Fornecedor;
import com.entities.classes.Telefone.TelefoneCliente;
import com.entities.classes.Telefone.TelefoneFornecedor;

public class testeTelefone {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("NomeClienteTeste", "000.000.000-00", "teste@gmail.com", "teste123456");

        TelefoneCliente telefoneDoCliente = new TelefoneCliente(cliente, "(xx)yrrrr-rrrr");
        TelefoneCliente telefoneDoCliente2 = new TelefoneCliente(cliente, "(xx)yrrrr-rrrr");

        cliente.getListaTelefone().add(telefoneDoCliente);
        cliente.adicionarTelefone(telefoneDoCliente2);

        System.out.println(cliente.toString());

        //

        Fornecedor fornecedor = new Fornecedor("NomeFornecedorTeste", "O Allan é gay", "123.456.789-12");
        TelefoneFornecedor telefoneFornecedor = new TelefoneFornecedor(fornecedor, "(ii)thhhh-hhhh");
        TelefoneFornecedor telefoneDoFornecedor = new TelefoneFornecedor(fornecedor, "(yy)qaaaa-zzzz");

        fornecedor.adicionarTelefone(telefoneFornecedor);
        fornecedor.adicionarTelefone(telefoneDoFornecedor);

        System.out.println(fornecedor.toString());
    }
}
