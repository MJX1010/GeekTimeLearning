package com.tm.apitest.base;

public class Base2 {
    /*
    * ���� ���
    *
    * System.out.println() / print() / printf()
    * printf ��ʽ��
    *   %d	��ʽ���������
        %x	��ʽ�����ʮ����������
        %f	��ʽ�����������
        %e	��ʽ�������ѧ��������ʾ�ĸ�����
        %s	��ʽ���ַ���

    System.out.printf("n=%d, hex=%08x", n, n); // ע�⣬����%ռλ�����봫��������
    *
    *   import java.util.Scanner;
    *   Scanner scanner = new Scanner(System.in); // ����Scanner����
        System.out.print("Input your name: "); // ��ӡ��ʾ
        String name = scanner.nextLine(); // ��ȡһ�����벢��ȡ�ַ���
        System.out.print("Input your age: "); // ��ӡ��ʾ
        int age = scanner.nextInt(); // ��ȡһ�����벢��ȡ����
        System.out.printf("Hi, %s, you are %d\n", name, age); // ��ʽ�����
    * */

    /*
    *  ���̿���
    *
    *  ���if���� Ҫ�ر�ע���ж�˳��
    *  ע��߽�����
    *  ע�� ��������==�жϲ�����  �ò�ֵ�ľ���ֵ�ж�
    *
    *
    * */

    //�ж��Ƿ���ȣ�
/*
* ��Java�У��ж�ֵ���͵ı����Ƿ���ȣ�����ʹ��==����������ǣ��ж��������͵ı����Ƿ���ȣ�==��ʾ�������Ƿ���ȡ���
* ����˵���Ƿ�ָ��ͬһ������
* ���磬���������String���ͣ����ǵ���������ͬ�ģ����ǣ��ֱ�ָ��ͬ�Ķ�����==�жϣ����Ϊfalse��
*
*  String s1 = "hello";
   String s2 = "HELLO".toLowerCase();
   *
  Ҫ�ж��������͵ı��������Ƿ���ȣ�����ʹ��equals()������
  ע�� s1.equals(s2)  ���s1 Ϊ��ʱ ���п�����
  * ���鷽�� �����equals�Ƚ��� �бض���Ϊ�յ�ֵ ����
  * ��hello��.equals(s1)
  *
  *

  *
  switch case
  * 1.case ���д�͸�� ��дbreak������쳣���
  * 2.case ���� ���caseִ�еĴ����һ�������Ե���д
  * 3.case ���ԱȽ��ַ������Ƚϵ����������
  *
  *
  * Java14 ���﷨ ��֧��Java8
  *     int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // ע�⸳ֵ���Ҫ��;����

    yield���﷨
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch��䷵��ֵ
            }
        };
 * */
}
