package br.ufg.inf.generator.validadores.valores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public final class StringValidador {

    private StringValidador() {
        // Do nothing
    }

    public static void cnpj(final String cnpj) {
        if (cnpj != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{14}$").matcher(cnpj);
            if (!matcher.find()) {
                throw new IllegalStateException(String.format("Formato CNPJ Invalido (%s)", cnpj));
            }
        }
    }

    public static void cpf(final String cpf) {
        if (cpf != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{11}$").matcher(cpf);
            if (!matcher.find()) {
                throw new IllegalStateException(String.format("Formato CPF Invalido (%s)", cpf));
            }
        }
    }

    public static void inscricaoEstadual(final String inscricaoEstadual) {
        if (inscricaoEstadual != null) {
            final Matcher matcher = Pattern.compile("^(Isento|[0-9]{1,20})$").matcher(inscricaoEstadual);
            if (!matcher.find()) {
                throw new IllegalStateException(String.format("Inscricao estadual invalido (%s)", inscricaoEstadual));
            }
        }
    }

    public static void telefone(final String telefone) {
        if (telefone != null) {
            final Matcher matcher = Pattern.compile("^[0-9]{6,14}$").matcher(telefone);
            if (!matcher.find()) {
                throw new IllegalStateException(String.format("Telefone de tamanho invalido (%s)", telefone));
            }
        }
    }

    public static void exatamente8N(final String string) {
        if (string != null) {
            StringValidador.apenasNumerico(string);
            StringValidador.validaTamanhoExato(string, 8);
        }
    }

    public static void tamanho0ate255(final String string) {
        if (string != null) {
            StringValidador.intervalo(string, 0, 255);
        }
    }

    public static void tamanho255(final String string) {
        if (string != null) {
            StringValidador.validaTamanhoMaximo(string, 255);
        }
    }

    public static void tamanho25(final String string) {
        if (string != null) {
            StringValidador.validaTamanhoMaximo(string, 25);
        }
    }

    private static void apenasNumerico(final String string) {
        if (!StringUtils.isNumeric(string)) {
            throw new IllegalStateException(String.format("a string precisa ser numerica (%s)", string));
        }
    }

    private static void validaTamanhoMaximo(final String string, final int tamanho) {
        if (string.length() < 1 || string.length() > tamanho) {
            throw new IllegalStateException(String.format("\"%s\" deve possuir entre 1-%s caracteres", string, tamanho));
        }
    }

    private static void validaTamanhoExato(final String string, final int tamanho) {
        if (string.length() != tamanho) {
            throw new IllegalStateException(String.format("\"%s\" deve possuir %s caracteres", string, tamanho));
        }
    }

    private static void intervalo(final String string, final int inicio, final int fim) {
        if (string.length() < inicio || string.length() > fim) {
            throw new IllegalStateException(String.format("\"%s\" deve possuir entre %s-%s caracteres", string, inicio, fim));
        }
    }

}
