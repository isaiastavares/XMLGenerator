package br.ufg.inf.generator.xml.transformadores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.simpleframework.xml.transform.Transform;

public class LocalDateTransformer implements Transform<LocalDate> {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate read(final String data) throws Exception {
        return LocalDate.parse(data, DATE_FORMATTER);
    }

    @Override
    public String write(final LocalDate data) throws Exception {
        return data.toString();
    }
}
