package br.ufg.inf.generator.xml.estrutura.sistemasgestao;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavel;
import java.util.ArrayList;
import org.simpleframework.xml.Element;

public class Sistemas extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "EmpresaDesenvolvedora", required = false)
    private EmpresaDesenvolvedora empresaDesenvolvedora;

    @Element(name = "ArquivosExecutaveis", required = false)
    private ArrayList<ArquivoExecutavel> arquivosExecutaveis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EmpresaDesenvolvedora getEmpresaDesenvolvedora() {
        return empresaDesenvolvedora;
    }

    public void setEmpresaDesenvolvedora(EmpresaDesenvolvedora empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }

    public ArrayList<ArquivoExecutavel> getArquivosExecutaveis() {
        return arquivosExecutaveis;
    }

    public void setArquivosExecutaveis(ArrayList<ArquivoExecutavel> arquivosExecutaveis) {
        this.arquivosExecutaveis = arquivosExecutaveis;
    }

}
