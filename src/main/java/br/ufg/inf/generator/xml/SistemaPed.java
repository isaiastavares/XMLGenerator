package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author hiago
 */
@Root(name = "SistemaPed")
public class SistemaPed extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "EmpresaDesenvolvedora", required = true)
    private EmpresaDesenvolvedora empresaDesenvolvedora = new EmpresaDesenvolvedora();

    @Element(name = "ArquivosExecutaveis", required = true)
    private ArquivosExecutaveis arquivosExecutaveis;

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

    public ArquivosExecutaveis getArquivosExecutaveis() {
        return arquivosExecutaveis;
    }

    public void setArquivosExecutaveis(ArquivosExecutaveis arquivosExecutaveis) {
        this.arquivosExecutaveis = arquivosExecutaveis;
    }
}