package com.tm.apitest.core;

import java.util.StringJoiner;

public class TestStringJoiner {

    public void test1() {
        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");  //������ӿ�ͷ��β�ַ���
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

        //�������Ҫ��ӿ�ͷ��β��ֱ��ʹ��join
        String s = String.join(", ", names);
    }
}
