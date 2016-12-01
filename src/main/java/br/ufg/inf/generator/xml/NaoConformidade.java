package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "NaoConformidades")
public class NaoConformidade {
    
    @Element (name = "Requisito", required = true)
    private String requisito;
    
    @Element (name = "Item", required = true)
    private int item;
    
    @Element (name = "Descrição", required = true)
    private String descricao;

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
