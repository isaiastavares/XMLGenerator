package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Kalyn
 */
public class MarcaModeloTest {

    private String MARCA;
    private String MODELO;

    @Before
    public void beforeMethod() {
        MARCA = "Marca";
        MODELO = "Modelo";
    }

    @Test
    public void testMarcaValida() {
        MarcaModelo instance = new MarcaModelo();
        instance.setMarca(MARCA);
        String result = instance.getMarca();
        assertEquals(MARCA, result);
    }

    @Test
    public void testModeloValido() {
        MarcaModelo instance = new MarcaModelo();
        instance.setModelo(MODELO);
        String result = instance.getModelo();
        assertEquals(MODELO, result);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testMarcaNulo() {
        MarcaModelo instance = new MarcaModelo();
        instance.setMarca(null);
        instance.setModelo(MODELO);
        instance.toString();
    }
    
    @Test(expected = IllegalStateException.class)
    public void testModeloNulo() {
        MarcaModelo instance = new MarcaModelo();
        instance.setMarca(MARCA);
        instance.setModelo(null);
        instance.toString();
    }

}
