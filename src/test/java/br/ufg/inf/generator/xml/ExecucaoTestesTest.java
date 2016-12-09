package br.ufg.inf.generator.xml;

import br.ufg.inf.generator.xml.estrutura.mensagem.ExecucaoTestes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExecucaoTestesTest {

    private static final String NOME = "Nome Teste";
    private static final String CARGO = "Gerente de testes";
    private static final String CPF = "00000000000";

    @Test
    public void testNomeValido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setNome(NOME);
        String resultado = exTestes.getNome();
        assertEquals(NOME, resultado);
    }

    @Test
    public void testCargoValido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setCargo(CARGO);
        String resultado = exTestes.getCargo();
        assertEquals(CARGO, resultado);
    }

    @Test
    public void testCpfValido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setCpf(CPF);
        String resultado = exTestes.getCpf();
        assertEquals(CPF, resultado);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeInvalido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setCargo(CARGO);
        exTestes.setCpf(CPF);
        exTestes.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCargoInvalido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setNome(NOME);
        exTestes.setCpf(CPF);
        exTestes.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfInvalido() {
        final ExecucaoTestes exTestes = new ExecucaoTestes();
        exTestes.setNome(NOME);
        exTestes.setCargo(CARGO);
        exTestes.toString();
    }
}
