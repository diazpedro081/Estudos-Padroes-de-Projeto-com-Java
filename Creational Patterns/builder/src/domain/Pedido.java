package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Pedido() {
        produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public BigDecimal getValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            BigDecimal quantidade = new BigDecimal(produto.getQuantidade());
            BigDecimal valor = produto.getValor();
            BigDecimal valorTotal = valor.multiply(quantidade);
            total = total.add(valorTotal);
        }
        return total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produto) {
        this.produtos = produto;
    }

    @Override
    public String toString() {
        return "Numero Pedido: " + numero +
                "\nCliente: " + cliente +
                "\nVendedor: " + vendedor +
                "\nProduto(s): " + produtos;
    }

}
