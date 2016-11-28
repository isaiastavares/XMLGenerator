/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author hiago
 */

@Root(name = "PerfisRequisito")
public class PerfisRequisito extends LaudoBase {

    @Element(name = "PerfilRequisito", required = true)
    private String perfilRequisito;

    public String getPerfilRequisito() {
        return perfilRequisito;
    }

    public void setPerfilRequisito(String perfilRequisito) {
        this.perfilRequisito = perfilRequisito;
    }

}
