package br.ufg.inf.generator.xml.parsers;

import java.io.File;

import org.simpleframework.xml.core.Persister;

import br.ufg.inf.generator.xml.MarcasModelosCompativeis;
import br.ufg.inf.generator.xml.transformers.LaudoRegistryMatcher;

public class ECFsParser {

    private final Persister persister;

    public ECFsParser() {
        this.persister = new Persister(new LaudoRegistryMatcher());
    }

    public MarcasModelosCompativeis ecfsParaObjeto(final File xml) {
        try {
            return this.persister.read(MarcasModelosCompativeis.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public MarcasModelosCompativeis ecfsParaObjeto(final String xml) {
        try {
            return this.persister.read(MarcasModelosCompativeis.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }
}
