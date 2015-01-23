package com.lisun.examples.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Alex
 * @since 23.01.2015
 */
public class DataObject extends NonSerializable implements Serializable {
    static final long serialVersionUID = 1L;

    private transient CustomObject customObject = new CustomObject();

    private int i = 5;
    private String s = "aaa";
    private transient String[] def = {"aaa", "bbb", "ccc"};

    private void writeObject(
            ObjectOutputStream out) throws IOException {
        out.writeObject(getMyData());
        out.defaultWriteObject();
    }

    private void readObject(
            ObjectInputStream in) throws IOException, ClassNotFoundException {
        String dataField = (String) in.readObject();
        setMyData(dataField);
        in.defaultReadObject();
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "\ncustomObject=" + customObject + "\n" +
                " i=" + i + ",\n" +
                " s='" + s + '\'' + ",\n" +
                " def=" + Arrays.toString(def) +
                '}';
    }
}
