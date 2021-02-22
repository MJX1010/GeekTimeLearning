package com.tm.apitest.base;

/* ������

 ����Ȩ��
 Java�ڽ��ķ���Ȩ�ް���public��protected��private��packageȨ�ޣ�

 �ֲ�����
 ʹ�þֲ�����ʱ��Ӧ�þ����ܰѾֲ���������������С���������Ӻ������ֲ�������
 Java�ڷ����ڲ�����ı����Ǿֲ��������ֲ�������������ӱ���������ʼ����һ���������




�����ȷ���Ƿ���Ҫpublic���Ͳ�����Ϊpublic�����������ٵر�¶������ֶκͷ�����
�ѷ�������ΪpackageȨ�������ڲ��ԣ���Ϊ������ͱ�������ֻҪλ��ͬһ��package�����Դ���Ϳ��Է��ʱ��������packageȨ�޷�����
һ��.java�ļ�ֻ�ܰ���һ��public�࣬�����԰��������public�ࡣ�����public�࣬�ļ��������public���������ͬ��




 * Ƕ����  (�ڲ���)
 * ����Java֧��Ƕ���࣬���һ�����ڲ���������Ƕ���࣬��ô��Ƕ����ӵ�з���private��Ȩ�ޣ�
 *
 *
   ������һ��class�ڲ���class��ΪǶ���ࣨnested class����Java֧�ֺü���Ƕ���ࡣ


   �Ǿ�̬�� Inner class ���ܵ������ڣ���Ҫ������һ�� Outer class


   Ҫʵ����һ��Inner�����Ǳ������ȴ���һ��Outer��ʵ����Ȼ�󣬵���Outerʵ����new������Innerʵ����
   Base6 base6 = new Base6();
   Base6.Inner inner = base6.new Inner();
   ������ΪInner Class������һ��thisָ�����Լ���
   �������س���һ��Outer Classʵ����������Outer.this�������ʵ����
   ���������ԣ�ʵ����һ��Inner Class��������Outerʵ����

�鿴������class
   Outer�౻����ΪOuter.class����Inner�౻����ΪOuter$Inner.class


   �����ڲ��� Anonymous class

 *
 * */

import java.util.HashMap;

public class Base6 {

    private String name;
    private static String alias;

    private static void Test() {
        System.out.println("˽�о�̬����");
    }

    static class StaticInner {
        public void Test() {
            Base6.Test();
        }
    }

    class Inner {

    }

    //�����ڲ���
    void annoymousInner() {

        /*
        * Runnable �� interface  ���ܱ�ʵ����
        *
        * ���� ʵ����Runnable �ӿڵ�������  ��ʵ������ Ȼ��ת��Ϊ Runnable
        *
        * ����������ʱ�������Ҫʵ������
        *
        * ��Inner classһ�������Է���Outer class��private�ֶκͷ���
        *
        * �����������  Outer$1.class
        * �ж�������� ������  Outer$1.class  Outer$2.class .����
        *
        * ���Է��� Outer.this �� Outer private
        * */

        //�����滻��lambda
        // Runnable r = () -> System.out.println("annoymous inner ...");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("annoymous inner ..." + Base6.this.name); //����ʡ��  Base6.this
            }
        };
        new Thread(r).start();

        /*
        * ���ӿ��� ������ Ҳ����ȫ�̳��� ��ͨ��
        *
        *
        *
        * */

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<String, String>() {}; //������
        //�����಻��ʡ�� HashMap<String, String> map2 = new HashMap<>() {};
        HashMap<String, String> map3 = new HashMap<String, String>() {
            {
                put("A", "1");
                put("B", "2");
            }
        };
    }

    //static nested class
    // ��ͬ����ͨ�ڲ��࣬ ���������� Outerʵ���� ����һ����ȫ�������࣬ �޷����� Outer.this,
    // ���Է��� Outer private static �ֶκͷ���
    static class StaticNested {
        void TestStaticNested() {
            System.out.println("static nested ..." + Base6.alias);  // ����ʡ�� Base6.
        }
    }
}
