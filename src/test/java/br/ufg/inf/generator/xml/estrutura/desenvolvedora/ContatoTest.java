package br.ufg.inf.generator.xml.estrutura.desenvolvedora;

import br.ufg.inf.generator.xml.estrutura.desenvolvedora.Contato;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContatoTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final String CPF = "dfkjdsfjkds";
    private static final String TELEFONE = "dfkjdsfjkds";
    private static final String EMAIL = "dfkjdsfjkds";

    @Test(expected = IllegalStateException.class)
    public void testNomeNuloInvalido() {
        final Contato contato = new Contato();
        contato.setNome(null);
        contato.setCpf(CPF);
        contato.setTelefone(TELEFONE);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfNuloInvalido() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setCpf(null);
        contato.setTelefone(TELEFONE);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testTelefoneNuloInvalido() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setCpf(CPF);
        contato.setTelefone(null);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmailNuloInvalido() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setCpf(CPF);
        contato.setTelefone(TELEFONE);
        contato.setEmail(null);
        contato.toString();
    }

    @Test
    public void testNomeValido() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        assertEquals(NOME, contato.getNome());
    }

    @Test
    public void testCpfValido() {
        final Contato contato = new Contato();
        contato.setCpf(CPF);
        assertEquals(CPF, contato.getCpf());
    }

    @Test
    public void testEmailValido() {
        final Contato contato = new Contato();
        contato.setEmail(EMAIL);
        assertEquals(EMAIL, contato.getEmail());
    }

    @Test
    public void testTelefoneValido() {
        final Contato contato = new Contato();
        contato.setTelefone(TELEFONE);
        assertEquals(TELEFONE, contato.getTelefone());
    }
}
