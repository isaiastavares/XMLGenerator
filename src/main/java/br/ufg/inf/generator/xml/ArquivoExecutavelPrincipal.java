/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

/**
 *
 * @author Kalyn
 */
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "ArquivoExecutavelPrincipal")
public class ArquivoExecutavelPrincipal {
    @Element(name = "Nome", required = true)
    private String nome;
    @Element(name = "Md5", required = true)
    private String md5;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
