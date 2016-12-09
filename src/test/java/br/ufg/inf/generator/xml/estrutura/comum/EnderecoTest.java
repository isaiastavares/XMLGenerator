package br.ufg.inf.generator.xml.estrutura.comum;

import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnderecoTest {

    private static final String VAZIO = "";
    private static final String LOGRADOURO = "NKwaAJ5ZJ49aQYmqBvxMhBzkGUqvtXnqusGEtjDzKCXPGwrEZCS8LGKHyBbV";
    private static final String NUMERO = "ll8DABEZYq9OrSPlxxYlfUN94";
    private static final String COMPLEMENTO = "Fr3gSvoAeKbGpQD3r98KFeB50P3Gq14XBVsv5fpiaBvJ3HTOpREiwYGs20Xw";
    private static final String BAIRRO = "67LQFlXOBK0JqAE1rFi2CEyUGW5Z8QmmHhzmZ9GABVLKa9AbV0uFR0onl7nU";
    private static final String MUNICIPIO = "s1Cr2hWP6bptQ80A9vWBuTaODR1U82LtKQi1DEm3LsAXu9AbkSeCtfXJVTKG";
    private static final String UF = "GO";
    private static final String CEP = "88095550";

    private static final String STRING_TAMANHO_256 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkjs";
    private static final String STRING_TAMANHO_26 = "ll8DABEZYq9OrSPlxxYlfUN944";
    private static final String STRING_TAMANHO_9 = "880955502";

    @Test(expected = IllegalStateException.class)
    public void testLogradouroComTamanhoMaiorQue255() {
        new Endereco().setLogradouro(STRING_TAMANHO_256);
    }

    @Test(expected = IllegalStateException.class)
    public void testLogradouroVazio() {
        new Endereco().setLogradouro(VAZIO);
    }

    @Test(expected = IllegalStateException.class)
    public void testNumeroComTamanhoMaiorQue25() {
        new Endereco().setNumero(STRING_TAMANHO_26);
    }

    @Test(expected = IllegalStateException.class)
    public void testNumeroVazio() {
        new Endereco().setNumero(VAZIO);
    }

    @Test
    public void testComplementoVazio() {
        new Endereco().setComplemento(VAZIO);
    }

    @Test(expected = IllegalStateException.class)
    public void testComplementoComTamanhoMaiorQue255() {
        new Endereco().setComplemento(STRING_TAMANHO_256);
    }

    @Test(expected = IllegalStateException.class)
    public void testBairroComTamanhoMaiorQue255() {
        new Endereco().setBairro(STRING_TAMANHO_256);
    }

    @Test(expected = IllegalStateException.class)
    public void testBairroVazio() {
        new Endereco().setBairro(VAZIO);
    }

    @Test(expected = IllegalStateException.class)
    public void testMunicipioComTamanhoMaiorQue255() {
        new Endereco().setMunicipio(STRING_TAMANHO_256);
    }

    @Test(expected = IllegalStateException.class)
    public void testMunicipioVazio() {
        new Endereco().setMunicipio(VAZIO);
    }

    @Test(expected = IllegalStateException.class)
    public void testCepComTamanhoMaiorQue8() {
        new Endereco().setCep(STRING_TAMANHO_9);
    }

    @Test(expected = IllegalStateException.class)
    public void testCepVazio() {
        new Endereco().setCep(VAZIO);
    }

    @Test(expected = IllegalStateException.class)
    public void testLogradouroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(null);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UF);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testNumeroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(null);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UF);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testComplementoNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(null);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UF);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testBairroNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(null);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UF);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMunicipioNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(null);
        endereco.setUf(UF);
        endereco.setCep(CEP);
        endereco.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testUFNulo() {
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
    public void testCepNulo() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        endereco.setNumero(NUMERO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setMunicipio(MUNICIPIO);
        endereco.setUf(UF);
        endereco.setCep(null);
        endereco.toString();
    }

    @Test
    public void testLogradouroCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setLogradouro(LOGRADOURO);
        assertEquals(LOGRADOURO, endereco.getLogradouro());
    }

    @Test
    public void testNumeroCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setNumero(NUMERO);
        assertEquals(NUMERO, endereco.getNumero());
    }

    @Test
    public void testComplementoCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setComplemento(COMPLEMENTO);
        assertEquals(COMPLEMENTO, endereco.getComplemento());
    }

    @Test
    public void testBairroCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setBairro(BAIRRO);
        assertEquals(BAIRRO, endereco.getBairro());
    }

    @Test
    public void testMunicipioCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setMunicipio(MUNICIPIO);
        assertEquals(MUNICIPIO, endereco.getMunicipio());
    }

    @Test
    public void testUfCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setUf(UF);
        assertEquals("GO", endereco.getUf());
    }

    @Test
    public void testCepCorreto() {
        final Endereco endereco = new Endereco();
        endereco.setCep(CEP);
        assertEquals(CEP, endereco.getCep());
    }
}
