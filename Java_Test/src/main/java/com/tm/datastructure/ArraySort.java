package com.tm.datastructure;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    /*
    * ð��������ص��ǣ�ÿһ��ѭ��������һ������������ĩβ����ˣ���һ��ѭ���Ϳ��ԡ��ٳ�����������ÿһ��ѭ��������һ��ѭ���Ľ���λ�ÿ�ǰһλ��

      ����ע�⣬����������ʵ�����޸������鱾��
    * */
    public static void bubbleSort() {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println(Arrays.toString(ns));

        for (int i = 0; i < ns.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    // ����ns[j]��ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }

        // �����:
        System.out.println(Arrays.toString(ns));
    }

    //����ע�⣬����������ʵ�����޸������鱾��
    /*
     * ����
     * int[] ns = { 9, 3, 6, 5 };
     *
     * Array.sort(ns);
     *
     * ��Ϊ {3, 5, 6, 9}
     *
     * ����
     * String[] ns = { "banana", "apple", "pear" };
     *
     * Array.sort(ns);
     *
     * ��Ϊ {"apple" , "banana", "pear"}
     * */


    //��������
    public static void descendingBubbleSort() {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // ����ǰ:
        System.out.println(Arrays.toString(ns));

        for (int i = 0; i < ns.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j + 1]) {
                    // ����ns[j]��ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }

        // �����:
        System.out.println(Arrays.toString(ns));
    }

    //����Array.sort��չ
    public static void test_array_sort() {
        //����
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        //����һ���Զ�����MyComparator�Ķ���
        Comparator cmp = new MyComparator();
        Arrays.sort(a,cmp);
        for(int arr:a) {
            System.out.print(arr + " ");
        }
    }
}

//����Array.sort��չ
//ʵ��Comparator�ӿ�
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
    		        /*���o1С��o2�����Ǿͷ�����ֵ�����o1����o2���Ǿͷ��ظ�ֵ��
    		         �����ߵ�һ�£��Ϳ���ʵ�ֽ���������,��֮�����Զ�������������*/
        return o2-o1;
    }
}
