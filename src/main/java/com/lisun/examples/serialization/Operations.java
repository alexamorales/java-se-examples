package com.lisun.examples.serialization;

import java.io.*;

/**
 * @author Alex
 * @since 23.01.2015
 */
public class Operations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
    }
}
