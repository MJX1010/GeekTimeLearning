/*
* �� �� ����ռ�
* һ��������������� �� ����.����
* JVMֻ������������ֻҪ������ͬ����Ͳ�ͬ
*
* ���Ƕ��ṹ�� �� . �ָ�
*
* ������ Ҫ�ر�ע�⣺��û�и��ӹ�ϵ��java.util��java.util.zip�ǲ�ͬ�İ�������û���κμ̳й�ϵ��
*
* ����Java�ļ���Ӧ��Ŀ¼���Ҫ�Ͱ��Ĳ��һ��
* ����
* package_sample/src/hong/Person.java
* package_sample/src/ming/Person.java
* package_sample/src/mr/jun/Array.java
*
* ��Ҫ����Ľ����
 * package_sample/bin/hong/Person.class
 * package_sample/bin/ming/Person.class
 * package_sample/bin/mr/jun/Array.class
*
* ִ�в������£�
* cd package_sample/src
* javac -d ../bin ming/Person.java hong/Person.java mr/jun/Array.json
*
*
* import ���� �����
*
* 1. ֱ��д��������
*
* 2. ���Ƽ�д��
* ��дimport��ʱ�򣬿���ʹ��*����ʾ����������������class��������������������Ӱ���class��
* ���Ƽ�д��
*
* 3. import static ����һ����ľ�̬�ֶκ;�̬����
*
*
* Java���������ձ����.class �ļ�ֻʹ�� ��������
*
* �����������������ֱ�Ӹ������������������class��
  ����Ǽ��������������˳�����β��ң�
     ���ҵ�ǰpackage�Ƿ�������class
     ����import�İ��Ƿ�������class
     ����java.lang���Ƿ�������class
     *
     *
  ��дclass��ʱ�򣬱��������Զ�������������import������
  * Ĭ���Զ�import��ǰpackage������class��
  * Ĭ���Զ�import java.lang.*��

* ������ ע�� �Զ��������java.lang���� ���� java.lang.reflect �Ȱ���Ҫ�ֶ�����
*
*
* ���������class������ͬ�����磬mr.jun.Arrays��java.util.Arrays����ôֻ��import����һ������һ������д����������

* Ϊ�˱������ֳ�ͻ��������Ҫȷ��Ψһ�İ������Ƽ���������ʹ�õ��õ�������ȷ��Ψһ�ԡ�
* �Ӱ��Ϳ��Ը��ݹ�������������
* Ҫע�ⲻҪ��java.lang���������������Լ����಻Ҫʹ����Щ���֣�
* Ҫע��Ҳ��Ҫ��JDK������������
 * */


package com.tm.apitest.base;

import static java.lang.System.*;

//�಻����private �� protected ����
class Base5 {

    //����������
    void testField() {
        System.out.println("����������");

        out.println("ʡ���� System ����");
    }

    private void testField2() {
        out.println("����������2");
    }

    protected void testField3() {
        out.println("����������3");
    }

    public void testField4() {
        out.println("����������4");
    }
}
