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

public class Base6 {

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
}
