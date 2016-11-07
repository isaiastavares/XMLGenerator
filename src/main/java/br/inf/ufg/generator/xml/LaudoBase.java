package br.inf.ufg.generator.xml;

import java.io.StringWriter;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import br.inf.ufg.generator.xml.transformers.LaudoRegistryMatcher;

public abstract class LaudoBase {

	private static final String CABECALHO = "<?xml version=\"1.0\" encoding= \"UTF-8\"?>";

	@Override
    public String toString() {
        final Persister persister = new Persister(new LaudoRegistryMatcher(), new Format(CABECALHO));
        try (StringWriter writer = new StringWriter()) {
            persister.write(this, writer);
            return writer.toString();
        } catch (final Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

}
