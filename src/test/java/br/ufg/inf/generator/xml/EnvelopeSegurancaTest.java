package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnvelopeSegurancaTest {

    private static final String MARCA = "ELC BRASIL";
    private static final String MODELO = "SLML 31";
    private static final String NUMERO = "3449127";

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMarcaNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setModelo(MODELO);
        envelopeSeguranca.setNumero(NUMERO);
        envelopeSeguranca.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModeloNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        envelopeSeguranca.setNumero(NUMERO);
        envelopeSeguranca.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNumeroNulo() {
        final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        envelopeSeguranca.setModelo(MODELO);
        envelopeSeguranca.toString();
    }

    @Test
    public void deveRetornarMarcaCorretamente() {
    	final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setMarca(MARCA);
        assertEquals(MARCA, envelopeSeguranca.getMarca());
    }

    @Test
    public void deveRetornarModeloCorretamente() {
    	final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setModelo(MODELO);
        assertEquals(MODELO, envelopeSeguranca.getModelo());
    }

    @Test
    public void deveRetornarNumeroCorretamente() {
    	final EnvelopeSeguranca envelopeSeguranca = new EnvelopeSeguranca();
        envelopeSeguranca.setNumero(NUMERO);
        assertEquals(NUMERO, envelopeSeguranca.getNumero());
    }
}
