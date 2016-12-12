package br.ufg.inf.generator.xml.estrutura.mensagem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AvaliadorTest {

    private static final String NOME = "teste";
    private static final String CARGO = "cargo";
    private static final String CPF = "12345667";

    @Test
    public void testGetNome() {
        final Avaliador av = new Avaliador();
        av.setNome(NOME);
        assertEquals(NOME, av.getNome());
    }

    @Test
    public void testSetNome() {
        final Avaliador av = new Avaliador();
        av.setNome(NOME);
        assertEquals(NOME, av.getNome());
    }

    @Test
    public void testCargoValido() {
        final Avaliador av = new Avaliador();
        av.setCargo(CARGO);
        assertEquals(CARGO, av.getCargo());
    }

    @Test
    public void testCpfValido() {
        final Avaliador av = new Avaliador();
        av.setCpf(CPF);
        assertEquals(CPF, av.getCpf());
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        final Avaliador av = new Avaliador();
        av.setCpf(CPF);
        av.setCargo(CARGO);
        av.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfNulo() {
        final Avaliador av = new Avaliador();
        av.setNome(NOME);
        av.setCargo(CARGO);
        av.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCargoNulo() {
        final Avaliador av = new Avaliador();
        av.setCpf(CPF);
        av.setCpf(CPF);
        av.toString();
    }
}
