package com.mrcodesniper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main App Start!");
        //读取路径XML文件信息 作为Spring上下文 要在resources文件夹下
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取上下文的Bean对象
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }
}