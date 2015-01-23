package com.lisun.examples.serialization;

import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Alex
 * @since 23.01.2015
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "dataObj")
public class DataObject extends NonSerializable implements Serializable {
    static final long serialVersionUID = 1L;

    @XmlElement
    private CustomObject customObject = new CustomObject();

    @XmlAttribute(name = "identifier")
    private int id = 5;

    @XmlElement
    private String s = "aaa";

    @XmlElement
    @XmlElementWrapper(name = "strArr")
    private String[] def = {"aaa", "bbb", "ccc"};

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
                "customObject=" + customObject +
                ", id=" + id +
                ", s='" + s + '\'' +
                ", def=" + Arrays.toString(def) +
                '}';
    }
}
