package com.tm.apitest.base;

public class Base5_1 {

    //����������ָһ�����������ͬһ��package��û��public���ε�class���Լ�û��private���ε��ֶκͷ�����
    // ���� ����Ĭ�������� ��ΧС��public��
    public static void TestField() {
        Base5 base5 = new Base5();  //���Է��� û��public ���ε� class
        base5.testField();          //������ ��ͬһ�����µ��࣬ ���Է��� ����private���εķ���

        //base5.testField2();       //������ �޷�����private ���εķ���
        base5.testField3();
        base5.testField4();
    }
}
