package com.tm.apitest.core;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestString {

    //Java�ַ�����һ����Ҫ�ص�����ַ������ɱ䡣���ֲ��ɱ�����ͨ���ڲ���private final char[]�ֶΣ��Լ�û���κ��޸�char[]�ķ���ʵ�ֵġ�
    String s1 = new String(new char[] {'h', 'e', 'l', 'l', 'o'} );
    String s2 = "hello";
    String s3 = "hello";
    String s4 = "HELLO".toLowerCase();
    String s5 = " \thello\r\n";
    String s6 = " \t\u3000hello\u3000";
    String s7 = " \n";
    String s8 = "";

    public void test1() {

        //�Ƚ��ַ��������Ƿ���ͬ������ʹ��equals �������� ==
        //�����ַ����Ƚϣ���������ʹ��equals()����
        //Ҫ���Դ�Сд�Ƚϣ�ʹ��equalsIgnoreCase()����
        //
        System.out.println("s1 == s2 ? " + (s1 == s2 ? "true" : "false"));
        System.out.println("s1 equals s2 ? " + (s1.equals(s2) ? "true" : "false"));
        System.out.println("s2 == s3 ? " + (s2 == s3 ? "true" : "false"));
        System.out.println("s2 equals s3 ? " + (s2.equals(s3) ? "true" : "false"));

        System.out.println("s3 == s4 ? " + (s3 == s4 ? "true" : "false"));
        System.out.println("s3 equals s4 ? " + (s3.equals(s4) ? "true" : "false"));

        //�ַ������ܸı䣬���� ����ָ�� �ĸ��ַ��� ���Ըı�
        System.out.println("s2 = " + s2);
        s2 = s2.toUpperCase();
        System.out.println("s2 = " + s2);

        System.out.println("contains : " + s2.contains("ll"));
        System.out.println("trim : " + s5.trim());
        //System.out.println("strip : " + s6.strip());  //java 11 �����Ƴ� ���Ŀո��ַ�
        System.out.println("isEmpty : " + s8.isEmpty());
        //System.out.println("isBlank : " + s7.isBlank()); //java 11  �հ��ַ�

        //�ַ���ƴ��
        String[] arr = {"A", "B", "C"};
        String s = String.join("***", arr);
        System.out.println("String join : " + s);


        //format
        //%s    �ַ���
        //%d    ����
        //%x    ʮ����������
        //%f    ��ʾ������
        //%.2f  ��ʾ��λС��
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        //String ����ת��
        System.out.println(String.valueOf(123));
        int n1 = Integer.parseInt("123");
        boolean b1 = Boolean.parseBoolean("true");

        //ע��  Integer�и�getInteger(String)�����������ǽ��ַ���ת��Ϊint�����ǰѸ��ַ�����Ӧ��ϵͳ����ת��ΪInteger
        //System.getProperty
        System.out.println("java.version ==> Integer.getInteger: " + Integer.getInteger("java.version"));


        //String ==> char[]
        char[] cs = "Hello".toCharArray();
        //char[] ==> String
        String s8 = new String(cs);
        //���ı�String������
        //new String(char[])�����µ�Stringʵ��ʱ����������ֱ�����ô����char[]���飬���ǻḴ��һ�ݣ�
        // ���ԣ��޸��ⲿ��char[]���鲻��Ӱ��Stringʵ���ڲ���char[]���飬��Ϊ����������ͬ�����顣
        cs[0] = 'X';


        //�������Ķ����п��ܸı䣬������Ҫ���ƶ�����ֱ������
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s10 = new Score(scores);
        s10.printScores();
        scores[2] = 99;
        s10.printScores();


        /*
        * �ַ�����
        *
        * Java�е�String �� Char  ���ڴ��������� Unicode���� ��ʾ��
        *
        * ת��������ǽ�String��byte[]ת������Ҫָ�����룻
        * ת��Ϊbyte[]ʱ��ʼ�����ȿ���UTF-8���롣
        */
        //byte[] bt1 = "Hello".getBytes(); // ��ϵͳĬ�ϱ���ת�������Ƽ�
        //byte[] bt2 = "Hello".getBytes("UTF-8"); // ��UTF-8����ת��
        //byte[] bt3 = "Hello".getBytes("GBK"); // ��GBK����ת��
        //byte[] bt4 = "Hello".getBytes(StandardCharsets.UTF_8); // ��UTF-8����ת��
        //String str1 = new String(bt2, "GBK"); // ��GBKת��
        //String str2 = new String(bt3, StandardCharsets.UTF_8); // ��UTF-8ת��


        /*
        * ��ͬ�汾Java ��String���ڴ��е��Ż�
        * ����JDK�汾��String������char[]�洢
        * ���µ�JDK�汾��String����byte[]�洢
        *
        * ���String������ASCII�ַ�����ÿ��byte�洢һ���ַ�������ÿ����byte�洢һ���ַ���
        * ��������Ŀ����Ϊ�˽�ʡ�ڴ棬��Ϊ�����ĳ��Ƚ϶̵�Stringͨ��������ASCII�ַ���
        * */
    }


    class Score {
        private int[] scores;
        public Score(int[] scores) {
            //�������Ķ����п��ܸı䣬������Ҫ���ƶ�����ֱ������
            this.scores = scores.clone();
        }

        public void printScores() {
            System.out.println(Arrays.toString(scores));
        }
    }
}