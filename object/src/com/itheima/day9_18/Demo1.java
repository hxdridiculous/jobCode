package com.itheima.day9_18;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器把xml文件加载到内存中,并返回一个文档对象
        Document read = saxReader.read(new File("C:\\Practise\\jobCode\\object\\src\\com\\itheima\\xml\\student.xml"));
        //3.获取到根标签
        Element rootElementelement = read.getRootElement();
        //4.通过根标签来获取student标签
        //elements():可以获取调用者所有的子标签.会把这些子标签放到一个集合中返回.
        //elements("标签名"):可以获取调用者所有的指定的子标签,会把这些子标签放到一个集合中并返回
        List<Element> students = rootElementelement.elements("student");
        //System.out.println(list.size());

        //用来装学生对象
        ArrayList<Student> list = new ArrayList<>();
        //5.遍历集合,得到每一个student标签
        for (Element element : students) {
            //获取id这个属性
            Attribute id = element.attribute("id");
            //获取id的属性值
            String idtext = id.getValue();
            //获取name标签
            //element("标签名"):获取调用者指定的子标签
            Element name = element.element("name");
            //获取这个标签的标签体内容
            String nametext = name.getText();
            //获取age标签
            Element age = element.element("age");
            //获取age标签的标签体内容
            String agetext = age.getText();
            //把获取的内容放到集合里面
            list.add(new Student(idtext,nametext,Integer.parseInt(agetext)));
        }
        //遍历集合
        for (Student student : list) {
            System.out.println(student);
        }

    }
}
