package br.ufg.inf.generator.xml.transformers;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class LocalDateTransformerTest {

    @Test
    public void deveTransformarDataStringEmLocalDate() throws Exception {
        Assert.assertEquals("2016-08-11", new LocalDateTransformer().read("2016-08-11").toString());
    }

    @Test
    public void deveTransformarLocalDateEmString() throws Exception {
        Assert.assertEquals("2016-08-11", new LocalDateTransformer().write(LocalDate.of(2016, 8, 11)));
    }
}
