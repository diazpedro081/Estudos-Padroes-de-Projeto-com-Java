package br.com.padroes.projeto.java.creationalPatterns.builder.src;

import java.math.BigDecimal;

import br.com.padroes.projeto.java.creationalPatterns.builder.src.constructor.ConstrutorPedido;
import br.com.padroes.projeto.java.creationalPatterns.builder.src.domain.Pedido;

public class AppVendas {
    public static void main(String[] args) {

        Pedido pedido = new ConstrutorPedido()
                .setNumero("0987654321")
                .setCliente("Jose", "95448254373", "81962244633")
                .setVendedor(1, "Vinicius")
                .setProduto("geladeira", 01, new BigDecimal(6500.00))
                .setProduto("Fogão", 02, new BigDecimal(1500.00))
                .builder();

        System.out.println(pedido);

    }
}
