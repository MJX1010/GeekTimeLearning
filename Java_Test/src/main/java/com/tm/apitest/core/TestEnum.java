package com.tm.apitest.core;

public enum TestEnum {

    /*
    * ʹ��enum�����ö������һ���������͡�ǰ�����ǽ������������ͱȽϣ�Ҫʹ��equals()������
    * ���ʹ��==�Ƚϣ����Ƚϵ��������������͵ı����Ƿ���ͬһ������
    * ��ˣ��������ͱȽϣ�Ҫʼ��ʹ��equals()��������enum���Ϳ������⡣
    *
    * ������Ϊenum���͵�ÿ��������JVM��ֻ��һ��Ψһʵ�������Կ���ֱ����==�Ƚ�
    *
    * */


    /*
    �ص㣺

    *   �����enum�������Ǽ̳���java.lang.Enum�����޷����̳У�
        ֻ�ܶ����enum��ʵ�������޷�ͨ��new����������enum��ʵ����
        �����ÿ��ʵ�������������͵�Ψһʵ����
        ���Խ�enum��������switch��䡣

        *
        *
        * ������enum �� ��ͨ��û��ʲô����
    *

    ��Ϊenum��һ��class��ÿ��ö�ٵ�ֵ����classʵ������ˣ���Щʵ����һЩ������
    name() �� Ĭ��toString() ����ֵһ��
    ordinal()   //�ı�ö�ٳ��������˳��ͻᵼ��ordinal()����ֵ�����仯

    * */

    Test1(0, "����һ"), Test2(1, "���Զ�");

    //private ���캯��  ��ÿ��ö�ٳ�������ֶ�(����)
    public final int testValue;
    private TestEnum(int value, String chinese) {
        this.testValue = value;
        this.chinese = chinese;
    }

    private final String chinese;
    @Override
    public String toString() {
        return this.chinese;
    }
}


