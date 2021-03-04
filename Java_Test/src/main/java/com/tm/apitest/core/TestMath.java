package com.tm.apitest.core;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class TestMath {

    public void testRandom() {

        //����[MIN, MAX) �����
        double x = Math.random(); // x�ķ�Χ��[0,1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min; // y�ķ�Χ��[10,50)
        long n = (long) y; // n�ķ�Χ��[10,50)������
        System.out.println(y);
        System.out.println(n);

        //StrictMath��֤����ƽ̨������������ȫ��ͬ�ģ���Math�ᾡ�����ƽ̨�Ż������ٶ�

        //����α�����   Math.random()���õ�Ҳ��Random��
        Random r = new Random();
        r.nextInt(); // 2071575453,ÿ�ζ���һ��
        r.nextInt(10); // 5,����һ��[0,10)֮���int
        r.nextLong(); // 8811649292570369305,ÿ�ζ���һ��
        r.nextFloat(); // 0.54335...����һ��[0,1)֮���float
        r.nextDouble(); // 0.3716...����һ��[0,1)֮���double
        //������������ӣ���ʹ��ϵͳ��ǰʱ�����Ϊ���ӣ����ÿ������ʱ�����Ӳ�ͬ���õ���α��������оͲ�ͬ

        Random r1 = new Random(12345);
        //ָ��һ�����ӣ��ܵõ���ȫȷ�������������
    }

    /*
    * SecureRandom�޷�ָ�����ӣ���ʹ��RNG��random number generator���㷨��
    * JDK��SecureRandomʵ�����ж��ֲ�ͬ�ĵײ�ʵ�֣��е�ʹ�ð�ȫ������Ӽ���α������㷨��������ȫ����������е�ʹ���������������������
    * ʵ��ʹ�õ�ʱ�򣬿������Ȼ�ȡ��ǿ�ȵİ�ȫ����������������û���ṩ����ʹ����ͨ�ȼ��İ�ȫ�����������
    *
    *
    * SecureRandom�İ�ȫ����ͨ������ϵͳ�ṩ�İ�ȫ����������������������
    * ���������ͨ��CPU������������д���̵��ֽڡ����������ȸ�������¼������ġ��ء���

    * ������ѧ�У���ȫ��������ǳ���Ҫ�����ʹ�ò���ȫ��α����������м�����ϵ���������ơ�
    * ��ˣ�ʱ���μǱ���ʹ��SecureRandom��������ȫ���������
    * */
    public void testSecureRandom() {
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // ��ȡ��ǿ�Ȱ�ȫ�����������
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // ��ȡ��ͨ�İ�ȫ�����������
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // �ð�ȫ��������buffer
        System.out.println(Arrays.toString(buffer));
    }
}
