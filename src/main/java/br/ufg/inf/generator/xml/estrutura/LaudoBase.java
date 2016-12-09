package br.ufg.inf.generator.xml.estrutura;

import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import br.ufg.inf.generator.xml.transformadores.LaudoRegistryMatcher;

public abstract class LaudoBase {

    private static final Logger LOG = Logger.getLogger(LaudoBase.class);

    private static final String CABECALHO = "<?xml version=\"1.0\" encoding= \"UTF-8\"?>";

    @Override
    public String toString() {
        final Persister persister = new Persister(new LaudoRegistryMatcher(), new Format(CABECALHO));
        try (StringWriter writer = new StringWriter()) {
            persister.write(this, writer);
            return writer.toString();
        } catch (final Exception e) {
            LOG.error(e.getMessage(), e);
            throw new IllegalStateException(e.getMessage());
        }
    }

}
