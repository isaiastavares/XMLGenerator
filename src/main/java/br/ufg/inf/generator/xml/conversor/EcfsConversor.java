package br.ufg.inf.generator.xml.conversor;

import java.io.File;

import org.apache.log4j.Logger;
import org.simpleframework.xml.core.Persister;

import br.ufg.inf.generator.xml.estrutura.comum.MarcasModelosCompativeis;
import br.ufg.inf.generator.xml.transformadores.LaudoRegistryMatcher;

public class EcfsConversor {

	private static final Logger LOG = Logger.getLogger(EcfsConversor.class);

    private final Persister persister;

    public EcfsConversor() {
        this.persister = new Persister(new LaudoRegistryMatcher());
    }

    public MarcasModelosCompativeis ecfsParaObjeto(final File xml) {
        try {
            return this.persister.read(MarcasModelosCompativeis.class, xml);
        } catch (final Exception e) {
        	LOG.error(e.getMessage(), e);
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public MarcasModelosCompativeis ecfsParaObjeto(final String xml) {
        try {
            return this.persister.read(MarcasModelosCompativeis.class, xml);
        } catch (final Exception e) {
        	LOG.error(e.getMessage(), e);
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }
}
