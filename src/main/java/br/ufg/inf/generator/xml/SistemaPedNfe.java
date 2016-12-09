package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.simpleframework.xml.Element;

public class SistemaPedNfe extends LaudoBase {

    @Element(name = "Nome", required = false)
    private String nome;

    @Element(name = "EmpresaDesenvolvedora", required = false)
    private EmpresaDesenvolvedora empresaDesenvolvedora = new EmpresaDesenvolvedora();

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
