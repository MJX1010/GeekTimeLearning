package com.tm.apitest.core;

/*
* ��װ����
* Java���Ŀ��ṩ�İ�װ���Ϳ��԰ѻ������Ͱ�װΪclass
*
* ��������	��Ӧ����������
boolean	    java.lang.Boolean
byte	    java.lang.Byte
short	    java.lang.Short
int	        java.lang.Integer
long	    java.lang.Long
float	    java.lang.Float
double	    java.lang.Double
char	    java.lang.Character
*
*
* �Զ�װ����Զ����䶼���ڱ�������ɵģ�JDK>=1.5��
*
* װ��Ͳ����Ӱ��ִ��Ч�ʣ��Ҳ���ʱ���ܷ���NullPointerException��
*
* ��װ���͵ıȽϱ���ʹ��equals()
*
* �����͸������İ�װ���Ͷ��̳���Number
*
* */
public class WrapperClass {

    public void test1() {
        int i = 100;
        // ͨ��new����������Integerʵ��(���Ƽ�ʹ��,���б��뾯��):
        Integer n1 = new Integer(i);
        // ͨ����̬����valueOf(int)����Integerʵ��:
        Integer n2 = Integer.valueOf(i);
        // ͨ����̬����valueOf(String)����Integerʵ��:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());

        //Auto Boxing �Զ�װ��
        //Auto Unboxing �Զ�����
        //�Զ�װ����Զ����䶼���ڱ�������ɵģ�JDK>=1.5��
        Integer ni = Integer.valueOf(i);
        int xi = ni.intValue();

        //�Ƚ�
        /*
        ==�Ƚϣ���С��������ͬ��Integer����true���ϴ��������ͬ��Integer����false��
        ��ΪInteger�ǲ����࣬��������Integer x = 127;�Զ���ΪInteger x = Integer.valueOf(127);
        Ϊ�˽�ʡ�ڴ棬Integer.valueOf()���ڽ�С������ʼ�շ�����ͬ��ʵ������ˣ�==�Ƚϡ�ǡ�á�Ϊtrue��
        ������ΪJava��׼���Integer�ڲ��л����Ż�����==�Ƚϣ�
        ������equals()�����Ƚ�����Integer
        * */
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true


        //��̬��������
        /*
        * ���ܴ������¡�����ľ�̬������Ϊ��̬����������
        *
        * Integer.valueOf()���Ǿ�̬�����������������ܵط��ػ����ʵ���Խ�ʡ�ڴ档
         * */

        //���ص�Byteʵ�����ǻ���ʵ��
        //Byte.valueOf();

        /*
        * ������Ƶ�ԭ��
        * ���ݵĴ洢����ʾҪ����
        *
        * */
        System.out.println(Integer.toString(100)); // "100",��ʾΪ10����
        System.out.println(Integer.toString(100, 36)); // "2s",��ʾΪ36����
        System.out.println(Integer.toHexString(100)); // "64",��ʾΪ16����
        System.out.println(Integer.toOctalString(100)); // "144",��ʾΪ8����
        System.out.println(Integer.toBinaryString(100)); // "1100100",��ʾΪ2����


        // booleanֻ������ֵtrue/false�����װ����ֻ��Ҫ����Boolean�ṩ�ľ�̬�ֶ�:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // int�ɱ�ʾ�����/��Сֵ:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long����ռ�õ�bit��byte����:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)

        // ����ת��ΪNumber:
        Number num = new Integer(999);
        // ��ȡbyte, int, long, float, double:
        byte b = num.byteValue();
        int nint = num.intValue();
        long ln = num.longValue();
        float fl = num.floatValue();
        double d = num.doubleValue();

        // �޷�������
        byte b1 = -1;   //�з������͵ķ�Χ -128 ~  127   �޷������ͷ�Χ 0 ~ 255
        byte b2 = 127;
        System.out.println(Byte.toUnsignedInt(b1)); // 255
        System.out.println(Byte.toUnsignedInt(b2)); // 127

        /*
        *
        * ��Ϊbyte��-1�Ķ����Ʊ�ʾ��11111111  (������ʽ ��ʾ)�����޷�������ת�����int����255��
          ���Ƶģ����԰�һ��short��unsignedת��Ϊint����һ��int��unsignedת��Ϊlong
        * */
    }
}
