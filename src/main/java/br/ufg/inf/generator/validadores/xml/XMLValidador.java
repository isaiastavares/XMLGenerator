package br.ufg.inf.generator.validadores.xml;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public final class XMLValidador {

    private static final Logger LOG = Logger.getLogger(XMLValidador.class);

    private XMLValidador() {
        // Do nothing
    }

    private static boolean validaXml(final String xml, final String xsd) {
        try {
            final URL xsdPath = XMLValidador.class.getResource(String.format("schemas/%s", xsd));
            final SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = schemaFactory.newSchema(new StreamSource(xsdPath.toURI().toString()));
            schema.newValidator().validate(new StreamSource(new StringReader(xml)));
            return true;
        } catch (SAXException | URISyntaxException | IOException e) {
            LOG.info("Falha ao validar o XML: " + xml);
            LOG.error(e.getMessage(), e);
            return false;
        }
    }

    public static boolean validaLaudo(final String arquivoXML) {
        return XMLValidador.validaXml(arquivoXML, "LaudoXmlSchema_v1.0.xsd");
    }
}
