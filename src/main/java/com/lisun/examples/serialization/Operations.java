package com.lisun.examples.serialization;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * @author Alex
 * @since 23.01.2015
 */
public class Operations {

    private static final String PACKAGE = DataObject.class.getPackage().getName();

    public static void main(String[] args) throws IOException, ClassNotFoundException, JAXBException {

        DataObject dataObject = new DataObject();
        dataObject.setMyData("haha");
        File file = new File("store.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);

        so.writeObject(dataObject);
        so.flush();
        so.close();

        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objNew = (DataObject) si.readObject();
        si.close();

        System.out.println(objNew);


        File file2 = new File("jaxb.xml");

        JAXBContext jc = JAXBContext.newInstance(PACKAGE);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Unmarshaller u = jc.createUnmarshaller();

        m.marshal(dataObject, file2);
        DataObject obj = (DataObject) u.unmarshal(file2);
    }
}
