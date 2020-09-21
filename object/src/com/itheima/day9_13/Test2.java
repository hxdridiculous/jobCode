package com.itheima.day9_13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.function.BiConsumer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties ppts = new Properties();
        ppts.setProperty("12312","2313123");
        ppts.setProperty("12312132","2313234231123");
        ppts.setProperty("124321432423143312","2312343213123");
        FileWriter fileWriter = new FileWriter("object\\src\\com\\itheima\\day9_13\\abc.properties");
        ppts.store(fileWriter,"");
        fileWriter.close();
        Properties ppts2 = new Properties();
        FileReader fileReader = new FileReader("object\\src\\com\\itheima\\day9_13\\abc.properties");
        ppts2.load(fileReader);
        fileReader.close();
        ppts2.forEach(new BiConsumer<Object, Object>() {
                          @Override
                          public void accept(Object o, Object o2) {
                              System.out.println(o);
                          }});
        System.out.println(ppts2);

    }
}
