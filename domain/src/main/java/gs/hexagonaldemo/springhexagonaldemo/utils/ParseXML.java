package gs.hexagonaldemo.springhexagonaldemo.utils;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ParseXML {
    private DocumentBuilder builder;
    private Document document;

    public ParseXML() {
    }

    public ParseXML(String xmlContent) throws ParserConfigurationException,
            SAXException, IOException {
        builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        ByteArrayInputStream stream = new ByteArrayInputStream(xmlContent.getBytes("UTF-8"));
        document = builder.parse(stream);
    }

    public String getValue(String xpathExpression) throws XPathExpressionException {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        XPathExpression expr = xpath.compile(xpathExpression);
        return (String) expr.evaluate(document, XPathConstants.STRING);
    }

    @Deprecated
    public static String obtenerXMLStringDesdeObjeto(Object obj) {
        StringWriter writer = new StringWriter();
        JAXB.marshal(obj, writer);
        String xml = writer.getBuffer().toString().replaceAll("\n|\r","");
        return xml;
    }

    public static String obtenerXMLStringDesdeObjeto(Object obj, JAXBContext jaxbContext) throws JAXBException {
        StringWriter writer = new StringWriter();
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(obj, writer);
        String xml = writer.getBuffer().toString().replaceAll("\n|\r","");
        return xml;
    }
}
