package com.tm.apitest.base;

import java.util.Arrays;

public class Base4 {

    /*
    * ��ά�����ÿ������Ԫ�صĳ��Ȳ���Ҫ����ͬ
    *
    *
    * */
    public static void two_dimentional_array () {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(ns.length); // 3


        //��ӡ��ά����
        //1. ʹ�����÷���
        //2. ˫��for
        System.out.println(Arrays.deepToString(ns));
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println();
        }
    }


    /*
    * ��ͼ��ʽ
    *
    * ��ֱ��
    *
    * ref : https://www.liaoxuefeng.com/wiki/1252599548343744/1259544232593792
    *
    * */
    public static void three_dimentional_array() {
        int[][][] ns = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11},
                        {12, 13}
                },
                {
                        {14, 15, 16},
                        {17, 18}
                }
        };
    }


    //��ά���������������飬��ά������Ƕ�ά���������
    //��ά�����ÿ������Ԫ�س��ȶ���Ҫ����ͬ
    //����Ķ�ά�����Ƕ�ά���飬���ʶ�ά�����һ��Ԫ��ʹ��array[row][col]
}
