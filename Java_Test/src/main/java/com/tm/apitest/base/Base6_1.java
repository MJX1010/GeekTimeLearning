package com.tm.apitest.base;

public class Base6_1 {

    /*
    * Inner Class��Anonymous Class����������ͬ�ģ�������������Outer Class��ʵ����
    * �������س���Outer.thisʵ������ӵ��Outer Class��private����Ȩ��
    *
    *
    * Static Nested Class�Ƕ����࣬��ӵ��Outer Class��private����Ȩ��
    * */
    public static void TestInnerClass() {
        Base6 base6 = new Base6();
        Base6.Inner inner = base6.new Inner();
        inner.TestInner();


        Base6.StaticInner staticInner = new Base6.StaticInner();
        staticInner.Test();
    }
}
