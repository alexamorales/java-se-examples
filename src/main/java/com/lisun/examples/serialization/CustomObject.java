package com.lisun.examples.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author Alex
 * @since 23.01.2015
 */
public class CustomObject implements Externalizable {
    private transient String value = "bbb";

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
        return "\nCustomObject{" +
                "value=" + value +
                '}';
    }
}
