package com.tm.apitest.base;

public class Base3 {
    /*
    * while ��ѭ��
    * */
    //�����Ͽ��������whileѭ����һ����ѭ�������ǣ�Java��int���������ֵ���ﵽ���ֵ���ټ�1���ɸ���������������˳���whileѭ����
    public static void test_while() {
        int sum = 0;
        int n = 1;
        while (n > 0) {
            sum = sum + n;
            n ++;
        }
        System.out.println(n); // -2147483648
        System.out.println(sum);


        while (n <= 100) { // ѭ��������n <= 100
            sum = sum + n; // ��n�ۼӵ�sum��
            n ++; // n�����1
        }
        System.out.println(sum); // 5050
    }

    //��Java�У�whileѭ�������ж�ѭ����������ִ��ѭ��������һ��do whileѭ��������ִ��ѭ�������ж���������������ʱ����ѭ��������������ʱ�˳���
    //do whileѭ��������ѭ��һ��
    public static void test_dowhile() {
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);
    }

    //ʹ��forѭ��ʱ��ǧ��Ҫ��ѭ�������޸ļ���������ѭ�������޸ļ�������������Ī��������߼�����
    //���ϣ��ֻ��������Ϊ����������Ԫ�أ� i = i + 2  ��������ѭ������ȥ�޸ı���i
    public static void test_for_cycle() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i=i+2) {
            System.out.println(ns[i]);
        }


        //ʹ��forѭ��ʱ������������iҪ����������forѭ���У�
        int ii;
        for (ii=0; ii<ns.length; ii++) {
            System.out.println(ns[ii]);
        }
        // ��Ȼ����ʹ��i
        // �ƻ��˱���Ӧ�ðѷ��ʷ�Χ������С��ԭ�� !
        int n = ii;


        //����ʡ��д�� �������ʹ��
        /*
        for (;;) {
        }
        for (int i = 0; ;) {
        }
        for (int i = 0; ; i++) {
        }
         */


        //for each д��
        //for eachѭ���ܹ��������С��ɵ���������������
        for (int ni : ns) {
            System.out.println(ni);
        }
    }


    /*
    * Բ���ʦп���ʹ�ù�ʽ����
    * pi / 4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
    * */
    public static void cal_pi_value() {
        double pi = 0;
        //�ⷨ 1
        /*
        for (double i = 1, j = 1; i < 10000; i += 2) {
            pi += (j % 2 != 0 ? 1 : -1) * ( 1 / i);
            j++;
        }*/

        //�ⷨ 2
        for(double i = 1; i < 99999; i += 4) {
            pi += 4 / i;
            pi -= 4 / (i + 2);
        }
        System.out.println(pi);
    }

    //break������������Լ����ڵ���һ��ѭ��

    //continue������ǰ��������ѭ����ֱ�Ӽ���ִ���´�ѭ��
    //�ڶ��Ƕ�׵�ѭ���У�continue���ͬ���ǽ��������Լ����ڵ�ѭ��

}
