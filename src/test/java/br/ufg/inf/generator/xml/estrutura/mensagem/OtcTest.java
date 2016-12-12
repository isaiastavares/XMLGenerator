package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.otc.PeriodoAnalise;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matheus
 */
public class OtcTest {

    Otc otc = new Otc();

    /**
     * Test of getRazaoSocial method, of class Otc.
     */
    @Test
    public void testGetRazaoSocial() {
        String razaoSocial = "Razao";
        otc.setRazaoSocial(razaoSocial);
        assertEquals(razaoSocial, otc.getRazaoSocial());
    }

    /**
     * Test of setRazaoSocial method, of class Otc.
     */
    @Test
    public void testSetRazaoSocial() {
        String razaoSocial = "Razao2";
        otc.setRazaoSocial(razaoSocial);
        assertEquals(razaoSocial, otc.getRazaoSocial());
    }

    /**
     * Test of getCnpj method, of class Otc.
     */
    @Test
    public void testGetCnpj() {
        String Cnpj = "Cnpj";
        otc.setCnpj(Cnpj);
        assertEquals(Cnpj, otc.getCnpj());
    }

    /**
     * Test of setCnpj method, of class Otc.
     */
    @Test
    public void testSetCnpj() {
        String Cnpj = "Cnpj2";
        otc.setCnpj(Cnpj);
        assertEquals(Cnpj, otc.getCnpj());
    }

    /**
     * Test of getInscricaoEstadual method, of class Otc.
     */
    @Test
    public void testGetInscricaoEstadual() {
        String inscricaoEstadual = "InscricaoEstadual";
        otc.setInscricaoEstadual(inscricaoEstadual);
        assertEquals(inscricaoEstadual, otc.getInscricaoEstadual());
    }

    /**
     * Test of setInscricaoEstadual method, of class Otc.
     */
    @Test
    public void testSetInscricaoEstadual() {
        String inscricaoEstadual = "InscricaoEstadual2";
        otc.setInscricaoEstadual(inscricaoEstadual);
        assertEquals(inscricaoEstadual, otc.getInscricaoEstadual());
    }

    /**
     * Test of getEndereco method, of class Otc.
     */
    @Test
    public void testGetEndereco() {
        Endereco endereco = new Endereco();
        otc.setEndereco(endereco);
        assertEquals(endereco, otc.getEndereco());
    }

    /**
     * Test of setEndereco method, of class Otc.
     */
    @Test
    public void testSetEndereco() {
        Endereco endereco = new Endereco();
        otc.setEndereco(endereco);
        assertEquals(endereco, otc.getEndereco());
    }

    /**
     * Test of getPeriodoAnalise method, of class Otc.
     */
    @Test
    public void testGetPeriodoAnalise() {
        PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        otc.setPeriodoAnalise(periodoAnalise);
        assertEquals(periodoAnalise, otc.getPeriodoAnalise());
    }

    /**
     * Test of setPeriodoAnalise method, of class Otc.
     */
    @Test
    public void testSetPeriodoAnalise() {
        PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        otc.setPeriodoAnalise(periodoAnalise);
        assertEquals(periodoAnalise, otc.getPeriodoAnalise());
    }

    /**
     * Test of getVersaoCotepe method, of class Otc.
     */
    @Test
    public void testGetVersaoCotepe() {
        String versaoCotepe = "versao";
        otc.setVersaoCotepe(versaoCotepe);
        assertEquals(versaoCotepe, otc.getVersaoCotepe());
    }

    /**
     * Test of setVersaoCotepe method, of class Otc.
     */
    @Test
    public void testSetVersaoCotepe() {
        String versaoCotepe = "versao2";
        otc.setVersaoCotepe(versaoCotepe);
        assertEquals(versaoCotepe, otc.getVersaoCotepe());
    }

}
