package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalyn
 */
public class MarcaModeloTest {
    private String MARCA = "Marca";
    private String MODELO = "Modelo";

    @Test
    public void testGeSettMarca() {
        MarcaModelo instance = new MarcaModelo();
        instance.setMarca(MARCA);
        String result = instance.getMarca();
        assertEquals(MARCA, result);
    }

    @Test
    public void testGeSettModelo() {
        MarcaModelo instance = new MarcaModelo();
        instance.setModelo(MODELO);
        String result = instance.getModelo();
        assertEquals(MODELO, result);
    }
    
}
