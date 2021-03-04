package com.tm.apitest.core;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class TestJavaBean {


    //privateʵ���ֶ� ��д���ϣ�
    /*

        Java�г�Ϊ����  ֻ��ͨ�ýз�������Java�﷨�涨
    *   // ������:
        public Type getXyz()
        // д����:
        public void setXyz(Type value)
    * */


    public static void test1() throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}


class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
