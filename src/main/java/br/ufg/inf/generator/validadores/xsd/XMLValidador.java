package br.ufg.inf.generator.validadores.xsd;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import br.ufg.inf.generator.validadores.exception.FalhaValidacaoException;

public final class XMLValidador {

	private XMLValidador() {
		// Do nothing
	}

    private static boolean validaXml(final String xml, final String xsd) throws FalhaValidacaoException {
		try {
			final URL xsdPath = XMLValidador.class.getResource(String.format("schemas/%s", xsd));
	        final SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
			Schema schema = schemaFactory.newSchema(new StreamSource(xsdPath.toURI().toString()));
			schema.newValidator().validate(new StreamSource(new StringReader(xml)));
		} catch (SAXException | URISyntaxException | IOException e) {
			throw new FalhaValidacaoException("Falha ao validar o XML: " + xml);
		}
        return true;
    }

    public static boolean validaLaudo(final String arquivoXML) throws Exception {
        return XMLValidador.validaXml(arquivoXML, "LaudoXmlSchema_v1.0.xsd");
    }
}
