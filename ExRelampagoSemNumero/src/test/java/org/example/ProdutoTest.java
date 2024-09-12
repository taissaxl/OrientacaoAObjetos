package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void deveRetornarQtdeEstoque() {
        Produto produto = new Produto("Ventilador", 0, 10, 5, 20);
        produto.setQtdeEstoque(10);
        assertEquals(10, produto.getQtdeEstoque());
    }

    @Test
    public void deveRetornarQtdeEstoqueInvalida() {
        try {
            Produto produto = new Produto("Ventilador", 0, 10, 5, 20);
            produto.setQtdeEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida!", e.getMessage());
        }
    }

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
    public void deveDefinirEstoqueMinimo() {
        Produto produto = new Produto("Cadeira", 0, 0, 0, 0);
        produto.setEstoqueMinimo(10);
        assertEquals(10, produto.getEstoqueMinimo());
    }

    @Test
    public void deveDefinirEstoqueMinimoInvalido() {
        try {
            Produto produto = new Produto("Cadeira", 0, 0, 0, 0);
            produto.setEstoqueMinimo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque invalido!", e.getMessage());
        }
    }

    @Test
    public void deveDefinirEstoqueMaximo() {
        Produto produto = new Produto("Cadeira", 0, 0, 0, 0);
        produto.setEstoqueMaximo(100);
        assertEquals(100, produto.getEstoqueMaximo());
    }

    @Test
    public void deveDefinirEstoqueMaximoInvalido() {
        try {
            Produto produto = new Produto("Cadeira", 0, 0, 0, 0);
            produto.setEstoqueMaximo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque invalido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstoqueAposDebito() {
        Produto produto = new Produto("Ventilador", 50, 10, 5, 100);
        produto.debitarEstoque(20);
        assertEquals(30, produto.getQtdeEstoque());
    }

    @Test
    public void deveRetornarEstoqueInvalidoDebito() {
        try {
            Produto produto = new Produto("Ventilador", 0, 0, 0,0);
            produto.debitarEstoque(5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstoqueAposCredito() {
        Produto produto = new Produto("Ventilador", 50, 10, 5, 100);
        produto.creditarEstoque(15);
        assertEquals(65, produto.getQtdeEstoque());
    }

    @Test
    public void deveRetornarEstoqueInvalidoCredito() {
        try {
            Produto produto = new Produto("Ventilador", 10, 10, 1,10);
            produto.creditarEstoque(5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque excedente!", e.getMessage());
        }
    }

    @Test
    public void deveCalcularValorVenda() {
        Produto produto = new Produto("Ventilador", 10, 10, 5, 100);
        assertEquals(10, produto.calcularValorVenda(1));
    }

    @Test
    public void deveRetornarVendaInvalida() {
        try {
            Produto produto = new Produto("Ventilador", 10, 10, 5, 10);
            produto.calcularValorVenda(-1);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Quantidade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveExibirHistorico() {
        Produto produto = new Produto("Fone", 10, 20, 5, 15);
        Pessoa cliente = new Pessoa("Adamastor");
        produto.vender("10-03-23", cliente, 1);
        assertEquals("Venda de " + produto + "\n", produto.exibirHistorico());
    }

    @Test
    public void deveRegistrarHistoricoInvalido() {
        try {
            Produto produto = new Produto("Fone", 0, 0, 5, 15);
            Fornecedor fornecedor = new Fornecedor("Adamastor", "123");
            produto.comprar("10-03-23", fornecedor, 1);
        } catch (NullPointerException e) {
            assertEquals("Nenhuma transacao registrada!", e.getMessage());
        }
    }
}