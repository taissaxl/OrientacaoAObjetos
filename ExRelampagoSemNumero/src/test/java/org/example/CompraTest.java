package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {
    @Test
    public void deveRetornarPrecoUnit() {
        Produto produto = new Produto("Cadeira", 0, 0, 0,0);
        produto.setPrecoUnit(10);
        assertEquals(10, produto.getPrecoUnit());
    }

    @Test
    public void deveRetornarPrecoUnitInvalido() {
        try {
            Produto produto = new Produto("Cadeira", 0, 0, 0,0);
            produto.setPrecoUnit(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido!", e.getMessage());
        }
    }

    @Test
    public void deveFazerCompra() {
        Produto produto = new Produto("Cadeira", 10, 1, 5,100);
        Fornecedor fornecedor = new Fornecedor("Loja", "123");
        produto.comprar("10-10-2023", fornecedor, 1);
        assertEquals(11, produto.getQtdeEstoque());
    }
}