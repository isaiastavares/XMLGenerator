package br.ufg.inf.generator.validadores.valores;

import br.ufg.inf.generator.validadores.valores.StringValidador;
import org.junit.Assert;
import org.junit.Test;

public class StringValidadorTest {

    private static final String STRING_TAMANHO_256 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkjs";
    private static final String STRING_TAMANHO_255 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkj";
    private static final String STRING_TAMANHO_26 = "ll8DABEZYq9OrSPlxxYlfUN944";
    private static final String STRING_TAMANHO_25 = "ll8DABEZYq9OrSPlxxYlfUN94";

    @Test
    public void testCnpjValido() {
        StringValidador.cnpj("07364111000102");
    }

    @Test(expected = IllegalStateException.class)
    public void testCnpjInvalidoTamanhoMenor() {
        StringValidador.cnpj("1234567890123");
        Assert.fail("Validacao nao funcionou");

    }

    @Test
    public void testCpfValido() {
        StringValidador.cpf("04396208138");
    }

    @Test(expected = IllegalStateException.class)
    public void testCpfInvalidoTamanhoMenor() {
        StringValidador.cpf("1234567890");
        Assert.fail("Validacao nao funcionou");

    }

    @Test
    public void testInscricaoEstadualValido() {
        StringValidador.inscricaoEstadual("Isento");
        StringValidador.inscricaoEstadual("1");
        StringValidador.inscricaoEstadual("12345678901234567890");
    }

    @Test(expected = IllegalStateException.class)
    public void testInscricaoEstadualInvalido() {
        try {
            StringValidador.inscricaoEstadual("");
        } catch (final IllegalStateException e) {
            StringValidador.inscricaoEstadual("123456789012345678901");
        }
    }

    @Test
    public void testTelefoneValido() {
        StringValidador.telefone("123456");
        StringValidador.telefone("12345678901234");
    }

    @Test(expected = IllegalStateException.class)
    public void testTelefoneInvalido() {
        StringValidador.telefone("12345");
    }

    @Test
    public void testTamanho8NValido() {
        StringValidador.exatamente8N("12345678");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanho8NInvalido() {
        StringValidador.exatamente8N("1234567N");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanho8NInvalidoMaior() {
        StringValidador.exatamente8N("123456789");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanho8NInvalidoMenor() {
        StringValidador.exatamente8N("1");
    }

    @Test
    public void testTamanho255Valido() {
        StringValidador.tamanho0ate255(STRING_TAMANHO_255);
        StringValidador.tamanho0ate255("");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanho255Invalido() {
        StringValidador.tamanho0ate255(STRING_TAMANHO_256);
    }

    @Test
    public void testTamanhoAte255Valido() {
        StringValidador.tamanho255(STRING_TAMANHO_255);
        StringValidador.tamanho255("o");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanho255InvalidoMenor() {
        StringValidador.tamanho255(STRING_TAMANHO_256);
        Assert.fail("Validacao falhou");
    }

    @Test
    public void testTamanho25Valido() {
        StringValidador.tamanho25(STRING_TAMANHO_25);
        StringValidador.tamanho25("o");
    }

    @Test(expected = IllegalStateException.class)
    public void testTamanhoSuperior25Invalido() {
        StringValidador.tamanho25(STRING_TAMANHO_26);
        Assert.fail("Validacao falhou");
    }
}
