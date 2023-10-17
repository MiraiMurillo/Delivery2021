package br.com.model.entities.classes

import br.com.model.entities.classes.usuario.Fornecedor
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.util.*

@Entity
class ProdutoFornecedor(
    @field:ManyToOne(cascade = [CascadeType.ALL]) @field:JoinColumn(name = "id_produto") @field:JsonIgnore var produto: Produto,

    @field:ManyToOne(cascade = [CascadeType.ALL]) @field:JoinColumn(name = "id_usuario") @field:JsonIgnore var fornecedor: Fornecedor,

    var quantidadeEmEstoque: Int,
    var preco: Float,
    private var dataCadastro: Date = Date()
) {
    @field:Id
    @field:GeneratedValue
    var id: Int? = null
    override fun toString(): String {
        return "-- ProdutoFornecedor --\nID: $id\nData de cadastro: $dataCadastro\nFornecedor: ${fornecedor.nome}\nProduto: ${produto.nome}Q\nuantidade em estoque: $quantidadeEmEstoque\nPreço: $preco"
    }
}
