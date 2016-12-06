package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Kalyn
 */
public class AprovacaoRelatorioTest {

    private static String NOME;
    private static String CARGO;
    private static String CPF;

    @Before
    public void beforeMethod(){
        NOME = "Nome";
        CARGO = "Cargo";
        CPF = "11111111111";
    }

    @Test
    public void testNomeValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testCargoValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setCargo(CARGO);
        String result = instance.getCargo();
        assertEquals(CARGO, result);
    }

    @Test
    public void testCpfValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setCpf(CPF);
        String result = instance.getCpf();
        assertEquals(CPF, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setNome(null);
        instance.setCargo(CARGO);
        instance.setCpf(CPF);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCargoNulo() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setNome(NOME);
        instance.setCargo(null);
        instance.setCpf(CPF);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfNulo() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setNome(NOME);
        instance.setCargo(CARGO);
        instance.setCpf(null);
        instance.toString();
    }
}
