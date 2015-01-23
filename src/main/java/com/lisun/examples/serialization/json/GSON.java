package com.lisun.examples.serialization.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lisun.examples.serialization.DataObject;

/**
 * @author Alex
 * @since 23.01.2015
 */
public class GSON {
    public static void main(String[] args) {
        DataObject dataObject = new DataObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(dataObject);

        System.out.println(json);

        DataObject obj = gson.fromJson(json, DataObject.class);
    }
}
