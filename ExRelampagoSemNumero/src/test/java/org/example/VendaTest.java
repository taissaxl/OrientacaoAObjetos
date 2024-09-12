package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {
    @Test
    public void deveFazerVenda() {
        Produto produto = new Produto("Cadeira", 10, 1, 5,100);
        Fornecedor fornecedor = new Fornecedor("Loja", "123");
        produto.vender("10-10-2023", fornecedor, 1);
        assertEquals(9, produto.getQtdeEstoque());
    }
}