package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.simpleframework.xml.Element;

public class SistemaPed extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "EmpresaDesenvolvedora", required = true)
    private EmpresaDesenvolvedora empresaDesenvolvedora = new EmpresaDesenvolvedora();

    @Element(name = "ArquivosExecutaveis", required = true)
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
