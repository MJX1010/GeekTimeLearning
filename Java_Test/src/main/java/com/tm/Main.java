package com.tm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hello world");

        //System.out.println(TestJson.serializeRes());

        //TestReflection.test();

        double df2 = 1.2 + 24 / 5; // 5.2       24/5 ~= 4
        char a = 'A';     //��ʾASCII�ַ�
        char zh = '��';   //���Ա�ʾ Unicode�ַ�
        int a1 = a;
        int zh1 = zh;
        char a2 = '\u0041';
        char zh2 = '\u4e2d';
        System.out.println(a2);
        System.out.println(zh2);
    }
}
