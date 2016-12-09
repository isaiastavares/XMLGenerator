package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.mensagem.TestadorAprovacaoRelatorio;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Kalyn
 */
public class TestadorAprovacaoRelatorioTest {

    private static String NOME;
    private static String CARGO;
    private static String CPF;

    @Before
    public void beforeMethod() {
        NOME = "Nome";
        CARGO = "Cargo";
        CPF = "11111111111";
    }

    @Test
    public void testNomeValido() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testCargoValido() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setCargo(CARGO);
        String result = instance.getCargo();
        assertEquals(CARGO, result);
    }

    @Test
    public void testCpfValido() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setCpf(CPF);
        String result = instance.getCpf();
        assertEquals(CPF, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setNome(null);
        instance.setCargo(CARGO);
        instance.setCpf(CPF);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCargoNulo() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setNome(NOME);
        instance.setCargo(null);
        instance.setCpf(CPF);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfNulo() {
        TestadorAprovacaoRelatorio instance = new TestadorAprovacaoRelatorio();
        instance.setNome(NOME);
        instance.setCargo(CARGO);
        instance.setCpf(null);
        instance.toString();
    }
}
