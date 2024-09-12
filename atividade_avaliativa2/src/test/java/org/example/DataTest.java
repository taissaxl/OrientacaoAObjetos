package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TesteDataTest {

    @Test
    void deveTestarData() {
        TesteData data = new TesteData(new Date());
        data.adicionarDias(5);
        assertEquals("02/10/2023", data.getDataFormatada());
    }

    @Test
    void deveRetornarMesData() {
        TesteData data = new TesteData(new Date());
        assertEquals(11, data.getMesData());
    }

    @Test
    void deveRetornarAnoData() {
        TesteData data = new TesteData(new Date());
        assertEquals(2023, data.getAnoData());
    }

    @Test
    void deveCalcularDiferencaDias() throws ParseException {
        TesteData data = new TesteData(new Date());
        assertEquals(1, data.calcularDataNascimento(data.converterStringParaData("01/12/2023")));
    }

    @Test
    void deveCriarData() throws ParseException {
        TesteData novaData = new TesteData(new Date());
        novaData.setData(novaData.converterStringParaData("05/12/2023"));
        assertEquals(12, novaData.getMesData());
    }

}