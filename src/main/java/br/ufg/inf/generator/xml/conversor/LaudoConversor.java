package br.ufg.inf.generator.xml.conversor;

import java.io.File;

import org.apache.log4j.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import br.ufg.inf.generator.telas.controladores.ScreensController;
import br.ufg.inf.generator.xml.estrutura.Laudo;

public class LaudoConversor {

    private static final Logger LOG = Logger.getLogger(ScreensController.class);

    public void salvarLaudo(Laudo laudo) {
        Serializer serializer = new Persister();
        String nome = laudo.getMensagem().getNumero();
        File result = new File(nome + ".xml");

        try {
            serializer.write(laudo, result);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }
}
