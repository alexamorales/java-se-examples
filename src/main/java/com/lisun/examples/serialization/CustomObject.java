package com.lisun.examples.serialization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author Alex
 * @since 23.01.2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomObject implements Externalizable {

    @XmlElement
    private String value = "bbb";

    public CustomObject() {

    }

    public CustomObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(value);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        value = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "value='" + value + '\'' +
                '}';
    }
}
