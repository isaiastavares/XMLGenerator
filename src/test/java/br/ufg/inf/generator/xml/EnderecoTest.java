package br.ufg.inf.generator.xml;

import org.junit.Test;

import br.ufg.inf.generator.xml.enuns.UnidadeFederativa;

public class EnderecoTest {

	private static final String LOGRADOURO = "NKwaAJ5ZJ49aQYmqBvxMhBzkGUqvtXnqusGEtjDzKCXPGwrEZCS8LGKHyBbV";
	private static final String NUMERO = "ll8DABEZYq9OrSPlxxYlfUN94";
	private static final String COMPLEMENTO = "Fr3gSvoAeKbGpQD3r98KFeB50P3Gq14XBVsv5fpiaBvJ3HTOpREiwYGs20Xw";
	private static final String BAIRRO = "67LQFlXOBK0JqAE1rFi2CEyUGW5Z8QmmHhzmZ9GABVLKa9AbV0uFR0onl7nU";
	private static final String MUNICIPIO = "s1Cr2hWP6bptQ80A9vWBuTaODR1U82LtKQi1DEm3LsAXu9AbkSeCtfXJVTKG";
	private static final String CEP = "88095550";

	private static final String STRING_TAMANHO_256 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkjs";
	private static final String STRING_TAMANHO_26 = "ll8DABEZYq9OrSPlxxYlfUN944";
	private static final String STRING_TAMANHO_9 = "880955502";

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirLogradouroComTamanhoInvalido() {
        try {
            new Endereco().setLogradouro("");
        } catch (final IllegalStateException e) {
            new Endereco().setLogradouro(STRING_TAMANHO_256);
        }
    }

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroComTamanhoInvalido() {
        try {
            new Endereco().setNumero("");
        } catch (final IllegalStateException e) {
            new Endereco().setNumero(STRING_TAMANHO_26);
        }
    }

	@Test
    public void devePermitirComplementoVazio() {
		new Endereco().setComplemento("");
    }

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirComplementoComTamanhoInvalido() {
		new Endereco().setComplemento(STRING_TAMANHO_256);
    }

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirBairroComTamanhoInvalido() {
        try {
            new Endereco().setBairro("");
        } catch (final IllegalStateException e) {
            new Endereco().setBairro(STRING_TAMANHO_256);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMunicipioComTamanhoInvalido() {
        try {
            new Endereco().setMunicipio("");
        } catch (final IllegalStateException e) {
            new Endereco().setMunicipio(STRING_TAMANHO_256);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCepComTamanhoInvalido() {
        try {
            new Endereco().setCep("");
        } catch (final IllegalStateException e) {
            new Endereco().setCep(STRING_TAMANHO_9);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLogradouroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void devePermitirComplementoNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBairroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMunicipioNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirUFNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCepNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UnidadeFederativa.GO);
        endereco.toString();
    }
}
