package com.tm.apitest.genericity;

import java.util.ArrayList;
import java.util.List;

public class TestGenericity<T> {
    List<Number> list = new ArrayList<Number>();
    List<Number> list2 = new ArrayList<>();
    List<Number> list3 = new ArrayList();


    private T first, last;

    public TestGenericity(T first, T last){
        this.first = first;
        this.last = last;
    }

    // ��̬���ͷ���  Ӧ��ʹ������������ ��k�� ��Ϊ����
    // static ��� <K> �� TestGenericity���� <T> û�й�ϵ
    public static <K> TestGenericity<K> create(K first, K last) {
        return new TestGenericity<>(first, last);
    }
    // static ��� <T> �� TestGenericity���� <T> û�й�ϵ
    public static <T> TestGenericity<T> create2(T first, T last) {
        return new TestGenericity<>(first, last);
    }
}
