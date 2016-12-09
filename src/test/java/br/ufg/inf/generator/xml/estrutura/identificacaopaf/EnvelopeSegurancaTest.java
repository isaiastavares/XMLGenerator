package br.ufg.inf.generator.xml.estrutura.identificacaopaf;

import br.ufg.inf.generator.xml.estrutura.identificacaopaf.EnvelopeSeguranca;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnvelopeSegurancaTest {

    private static final String MARCA = "ELC BRASIL";
    private static final String MODELO = "SLML 31";
    private static final String NUMERO = "3449127";

    @Test(expected = IllegalStateException.class)
    public void testMarcaNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(null);
        envelopeSeguranca.setModelo(MODELO);
        envelopeSeguranca.setNumero(NUMERO);
        envelopeSeguranca.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testModeloNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        envelopeSeguranca.setModelo(null);
        envelopeSeguranca.setNumero(NUMERO);
        envelopeSeguranca.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testNumeroNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        envelopeSeguranca.setModelo(MODELO);
        envelopeSeguranca.setNumero(null);
        envelopeSeguranca.toString();
    }

    @Test
    public void testMarcaCorreto() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        assertEquals(MARCA, envelopeSeguranca.getMarca());
    }

    @Test
    public void testModeloCorreto() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setModelo(MODELO);
        assertEquals(MODELO, envelopeSeguranca.getModelo());
    }

    @Test
    public void testNumeroCorreto() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setNumero(NUMERO);
        assertEquals(NUMERO, envelopeSeguranca.getNumero());
    }
}
