package br.ufg.inf.generator.xml.estrutura.sistemasgestao;

import br.ufg.inf.generator.xml.estrutura.sistemasgestao.EmpresaDesenvolvedora;
import br.ufg.inf.generator.xml.estrutura.sistemasgestao.Sistemas;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavel;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SistemasTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora EMPRESA = new EmpresaDesenvolvedora();
    private static final ArrayList<ArquivoExecutavel> ARQUIVO_EXE = new ArrayList<ArquivoExecutavel>();
    private final Sistemas SISTEMAS = new Sistemas();

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        SISTEMAS.setNome(null);
        SISTEMAS.setEmpresaDesenvolvedora(EMPRESA);
        SISTEMAS.setArquivosExecutaveis(ARQUIVO_EXE);
        SISTEMAS.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmpresaDesenvolvedoraNulo() {
        SISTEMAS.setNome("nomeEmpresaDesenvolvedora");
        SISTEMAS.setEmpresaDesenvolvedora(null);
        SISTEMAS.setArquivosExecutaveis(ARQUIVO_EXE);
        SISTEMAS.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExecutaveisNulo() {
        SISTEMAS.setNome("nomeEmpresaDesenvolvedora");
        SISTEMAS.setEmpresaDesenvolvedora(EMPRESA);
        SISTEMAS.setArquivosExecutaveis(null);
        SISTEMAS.toString();
    }

    @Test
    public void testNomeValido() {
        SISTEMAS.setNome(NOME);
        assertEquals(NOME, SISTEMAS.getNome());
    }

    @Test
    public void testEmpresaValido() {
        SISTEMAS.setEmpresaDesenvolvedora(EMPRESA);
        assertEquals(EMPRESA, SISTEMAS.getEmpresaDesenvolvedora());
    }

    @Test
    public void testArquivosValido() {
        SISTEMAS.setArquivosExecutaveis(ARQUIVO_EXE);
        assertEquals(ARQUIVO_EXE, SISTEMAS.getArquivosExecutaveis());
    }
}
