package com.tm.apitest.core;

public class TestStringBuilder {
    public void test1() {

        //��ʽ����
        /*
        ��ʽ���õ���Ĺ�������
        * ���÷�������this
        * */
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());


        /*
        * ������ͨ���ַ���+������������Ҫ���ǽ����дΪStringBuilder��
        * ��ΪJava�������ڱ���ʱ���Զ��Ѷ��������+��������ΪStringConcatFactory�Ĳ�����
        * �������ڣ�StringConcatFactory���Զ����ַ������Ӳ����Ż�Ϊ���鸴�ƻ���StringBuilder����
        *
        * */
        /*
        * StringBuffer �̰߳�ȫ�汾 ͨ��ͬ������֤����̲߳���StringBuffer�ǰ�ȫ������ͬ��Ҳ������ִ���ٶ�
        * StringBuilder��StringBuffer�ӿ���ȫ��ͬ��������ȫû�б�Ҫʹ��StringBuffer��
         * */
    }
}
