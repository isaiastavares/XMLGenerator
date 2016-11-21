package br.ufg.inf.generator.validadores;

import org.junit.Assert;
import org.junit.Test;

public class StringValidadorTest {

    private static final String STRING_TAMANHO_256 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkjs";
    private static final String STRING_TAMANHO_255 = "ll8DABEZYq9OrSPlxxYlfUN9tOfpNPZ4n6K5tJ2qw2P4OXey2IkREQXzwZrA6yFLF6MtUZbu0fGqmr67RjPaHuptcEg0CpCBoSJ30P6lIeeJG3o2JLeKFzYGoaTcgQws0XqsUe0nAuX4DWWQYTMhWmlgQ60NNuaQkkS10bfDhawLK4zQAZZQzU8C6aIjApFNSMqHNWXNP3rGhvEir6SB2rsm5bcgCLyGLXTJwBl8nqZoJms3bH6wToVdjfsjfkj";
    private static final String STRING_TAMANHO_26 = "ll8DABEZYq9OrSPlxxYlfUN944";
    private static final String STRING_TAMANHO_25 = "ll8DABEZYq9OrSPlxxYlfUN94";

    @Test(expected = IllegalStateException.class)
    public void naoDeveValidarCNPJCasoNaoPossua14Caracteres() {
        try {
            StringValidador.cnpj("1234567890123");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            StringValidador.cnpj("123456789012345");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveValidarCPFCasoNaoPossua11Caracteres() {
        try {
            StringValidador.cpf("1234567890");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException e) {
            StringValidador.cpf("123456789012");
        }
        Assert.fail("Validacao nao funcionou");
    }

    @Test
    public void deveValidarInscricaoEstadualCasoEstejaNoPadrao() {
        StringValidador.inscricaoEstadual("Isento");
        StringValidador.inscricaoEstadual("1");
        StringValidador.inscricaoEstadual("12345678901234567890");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDeveValidarInscricaoEstadualCasoNaoEstejaNoTamanho() {
        try {
            StringValidador.inscricaoEstadual("");
        } catch (final IllegalStateException e) {
            StringValidador.inscricaoEstadual("123456789012345678901");
        }
    }

    @Test
    public void deveValidarTamanho8N() {
        StringValidador.exatamente8N("12345678");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNaoNumerosParaTamanho8N() {
        StringValidador.exatamente8N("1234567N");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirExtrapolarTamanho8N() {
        StringValidador.exatamente8N("123456789");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirTamanhoMenorQue8() {
        StringValidador.exatamente8N("1");
    }

    @Test
    public void deveValidarTamanhoDeStringCasoEstejaDentroIntervalo0ate255() {
        StringValidador.tamanho0ate255(STRING_TAMANHO_255);
        StringValidador.tamanho0ate255("");
    }

    @Test(expected = IllegalStateException.class)
    public void deveLancarExcecaoCasoEstejaForaDoIntervalo0ate255() {
        StringValidador.tamanho0ate255(STRING_TAMANHO_256);
    }

    @Test
    public void deveValidarTamanhoDeStringCasoEstejaDentroIntervalo255() {
        StringValidador.tamanho255(STRING_TAMANHO_255);
        StringValidador.tamanho255("o");
    }

    @Test(expected = IllegalStateException.class)
    public void deveLancarExcecaoCasoEstejaForaDoIntervalo255() {
        try {
            StringValidador.tamanho255(STRING_TAMANHO_256);
            Assert.fail("Validacao falhou");
        } catch (final IllegalStateException e) {
            StringValidador.tamanho255("");
        }
        Assert.fail("Validacao falhou");
    }

    @Test
    public void deveValidarTamanhoDeStringCasoEstejaDentroIntervalo25() {
        StringValidador.tamanho25(STRING_TAMANHO_25);
        StringValidador.tamanho25("o");
    }

    @Test(expected = IllegalStateException.class)
    public void deveLancarExcecaoCasoEstejaForaDoIntervalo25() {
        try {
            StringValidador.tamanho25(STRING_TAMANHO_26);
            Assert.fail("Validacao falhou");
        } catch (final IllegalStateException e) {
            StringValidador.tamanho25("");
        }
        Assert.fail("Validacao falhou");
    }
}
