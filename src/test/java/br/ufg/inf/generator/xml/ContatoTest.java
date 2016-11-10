package br.ufg.inf.generator.xml;

import org.junit.Test;

public class ContatoTest {

	private static final String NOME = "dfkjdsfjkds";
	private static final String CPF = "dfkjdsfjkds";
	private static final String TELEFONE = "dfkjdsfjkds";
	private static final String EMAIL = "dfkjdsfjkds";

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeNulo() {
        final Contato contato = new Contato();
        contato.setCpf(CPF);
        contato.setTelefone(TELEFONE);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCpfNulo() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setTelefone(TELEFONE);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTelefoneNulo() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setCpf(CPF);
        contato.setEmail(EMAIL);
        contato.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirEmailNulo() {
        final Contato contato = new Contato();
        contato.setNome(NOME);
        contato.setCpf(CPF);
        contato.setTelefone(TELEFONE);
        contato.toString();
    }
}
