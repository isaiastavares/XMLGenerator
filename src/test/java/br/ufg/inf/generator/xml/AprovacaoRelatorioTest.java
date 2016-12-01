package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Kalyn
 */
public class AprovacaoRelatorioTest {
    
    private String NOME;
    private String CARGO;
    private String CPF;
    
    @Before
    public void beforeMethod(){
        NOME = "Nome";
        CARGO = "Cargo";
        CPF = "11111111111";
    }

    @Test
    public void testNomeValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testCargoValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setCargo(CARGO);
        String result = instance.getCargo();
        assertEquals(CARGO, result);
    }

    @Test
    public void testCpfValido() {
        AprovacaoRelatorio instance = new AprovacaoRelatorio();
        instance.setCpf(CPF);
        String result = instance.getCpf();
        assertEquals(CPF, result);
    }
    
}
