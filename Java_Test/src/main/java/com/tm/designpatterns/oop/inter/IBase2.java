package com.tm.designpatterns.oop.inter;

import java.util.ArrayList;
import java.util.List;

public interface IBase2 {

    /*
    * �ӿ�
    * vs. ������
    * 1. ��������԰����ֶ�
    * 2. ������̳У�extends�������࣬ ������ʵ��(implements)�ӿ�
    * 3. ���������ܱ������̳У��ӿڿ��Ա����ʵ��
    * 4. ��������Զ���ǳ��󷽷����ӿڿ��Զ���default����
    * 5. ������ͽӿڶ����Զ�����󷽷�
    *
    *
    *
    * */

    /*
    * �������interface��abstract class�ļ̳й�ϵ�����Գ�ָ��ô��롣
    * һ����˵�������߼��ʺϷ���abstract class�У������߼��ŵ��������࣬
    * ���ӿڲ�δ������̶ȡ����Բο�Java�ļ����ඨ���һ��ӿڡ��������Լ���������ļ̳й�ϵ��
    *
    * ��ʹ�õ�ʱ��ʵ�����Ķ�����Զֻ����ĳ����������࣬������ͨ���ӿ�ȥ����������Ϊ�ӿڱȳ����������
    * List list = new ArrayList();
    * Collection coll = list;
    * Iterable it = coll;
    *
    * Iterable
    *    ��                 Object
    * Collection              ��
    *    ��     ��    AbstractCollection
    *   List                  ��
    *          ��    AbstractList
    *                         ��
    *               ArrayList   LinkedList
    * */


    //default����
    //ʵ���಻��Ҫoverride

    // ����
    //  ��������Ҫ���ӿ�����һ������ʱ�����漰���޸�ȫ�����ࡣ
    //  �����������default��������ô����Ͳ���ȫ���޸ģ�ֻ��Ҫ����Ҫ��д�ĵط�ȥ��д����������

    //  default�����ͳ��������ͨ������������ͬ�ġ�
    //  ��Ϊinterfaceû���ֶΣ�default�����޷������ֶΣ������������ͨ�������Է���ʵ���ֶΡ�
    default  void test() {
        System.out.println("���Խӿ� default ����");
    }

    //�ӿڿ��Զ��� ��̬�ֶ�  ����Ϊfinal����
    public static final int Test1 = 1;
    //���Լ�дΪ
    int Test2 = 1;


}
