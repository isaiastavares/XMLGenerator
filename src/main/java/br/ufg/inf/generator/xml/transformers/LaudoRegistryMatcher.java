package br.ufg.inf.generator.xml.transformers;

import org.joda.time.LocalDate;
import org.simpleframework.xml.transform.RegistryMatcher;

public class LaudoRegistryMatcher extends RegistryMatcher {

    public LaudoRegistryMatcher() {
        super.bind(LocalDate.class, new LocalDateTransformer());
    }
}
