package com.lisun.examples.serialization;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * @author Alex
 * @since 23.01.2015
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName QNAME = new QName(
            XMLConstants.NULL_NS_URI, "data"
    );

    @XmlElementDecl(name = "dataObj")
    public JAXBElement<DataObject> createData(DataObject value) {
        return new JAXBElement<>(
                QNAME, DataObject.class, null, value);
    }

}
