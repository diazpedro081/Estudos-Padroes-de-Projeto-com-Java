package constructor;

import java.math.BigDecimal;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import domain.Vendedor;

public class ConstrutorPedido {

    private Pedido pedido;

    public ConstrutorPedido() {
        this.pedido = new Pedido();
    }

    public ConstrutorPedido setNumero(String numero) {
        this.pedido.setNumero(numero);
        return this;
    }

    public ConstrutorPedido setCliente(String nome, String cpf, String telefone) {
        this.pedido.setCliente(new Cliente(cpf, nome, telefone));
        return this;
    }

    public ConstrutorPedido setVendedor(int codigo, String nome) {
        this.pedido.setVendedor(new Vendedor(codigo, nome));
        return this;
    }

    public ConstrutorPedido setProduto(String nome, int quantidade, BigDecimal valor) {
        this.pedido.addProduto(new Produto(nome, quantidade, valor));
        return this;
    }

    public Pedido builder() {
        return pedido;
    }

}
