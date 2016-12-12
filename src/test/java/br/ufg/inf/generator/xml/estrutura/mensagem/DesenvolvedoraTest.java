package br.ufg.inf.generator.xml.estrutura.mensagem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.desenvolvedora.Contato;

public class DesenvolvedoraTest {

    private static final String RAZAO_SOCIAL = "teste";
    private static final String CNPJ = "12345";
    private static final String INSCRICAO_ESTADUAL = "inscricao";
    private static final Endereco ENDERECO = new Endereco();
    private static final Contato CONTATO = new Contato();
    private static final String RESP_ACOMP_TESTE = "teste";

    @Test
    public void testRazaoSocialValida() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setRazaoSocial(RAZAO_SOCIAL);
        assertEquals(RAZAO_SOCIAL, des.getRazaoSocial());
    }

    @Test
    public void testCnpjValida() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        assertEquals(CNPJ, des.getCnpj());
    }

    @Test
    public void testInscricaoEstadualValida() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        assertEquals(INSCRICAO_ESTADUAL, des.getInscricaoEstadual());
    }

    @Test
    public void testResponsavelTesteValida() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        assertEquals(RESP_ACOMP_TESTE, des.getRespAcompTestes());
    }

    @Test
    public void testEnderecoValido() {
        final Desenvolvedora des = new Desenvolvedora();
        Endereco endereco = new Endereco();
        des.setEndereco(endereco);
        assertEquals(endereco, des.getEndereco());
    }

    @Test
    public void testContatoValido() {
        final Desenvolvedora des = new Desenvolvedora();
        Contato contato = new Contato();
        des.setContato(contato);
        assertEquals(contato, des.getContato());
    }

    @Test(expected = IllegalStateException.class)
    public void testRazaoSocialNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        des.setEndereco(ENDERECO);
        des.setContato(CONTATO);
        des.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCnpjNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setRazaoSocial(RAZAO_SOCIAL);
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        des.setEndereco(ENDERECO);
        des.setContato(CONTATO);
        des.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testInscricaoEstadualNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        des.setRazaoSocial(RAZAO_SOCIAL);
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        des.setEndereco(ENDERECO);
        des.setContato(CONTATO);
        des.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testResponsavelTesteNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        des.setRazaoSocial(RAZAO_SOCIAL);
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        des.setEndereco(ENDERECO);
        des.setContato(CONTATO);
        des.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEnderecoNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        des.setRazaoSocial(RAZAO_SOCIAL);
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        des.setContato(CONTATO);
        des.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testContadoNulo() {
        final Desenvolvedora des = new Desenvolvedora();
        des.setCnpj(CNPJ);
        des.setRazaoSocial(RAZAO_SOCIAL);
        des.setRespAcompTestes(RESP_ACOMP_TESTE);
        des.setEndereco(ENDERECO);
        des.setInscricaoEstadual(INSCRICAO_ESTADUAL);
        des.toString();
    }

}
