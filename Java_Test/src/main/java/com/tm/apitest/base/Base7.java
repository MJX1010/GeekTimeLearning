package com.tm.apitest.base;

public class Base7 {
    /*
    * classpath ��JVM�õ���һ������������������ָʾJVM�������class
    *
    *
    * classpath����һ��Ŀ¼�ļ��ϣ������õ�����·�������ϵͳ���
    * windows ����: C:\work\project1\bin;C:\shared;"D:\My Documents\project1\bin"
    * linux ����: /usr/shared:/usr/local/bin:/home/liaoxuefeng/bin
    *
    *
    * ǿ�Ҳ��Ƽ���ϵͳ��������������classpath����������Ⱦ����ϵͳ������������JVMʱ����classpath�����Ƽ���������ʵ���Ͼ��Ǹ�java�����-classpath��-cp������
    * ���磺java -classpath .;C:\work\project1\bin;C:\shared abc.xyz.Hello
    *     ���߼�д��java -cp .;C:\work\project1\bin;C:\shared abc.xyz.Hello
    *
    *
    * û������ϵͳ����������Ҳû�д���-cp��������ôJVMĬ�ϵ�classpathΪ.������ǰĿ¼��
    * java abc.xyz.Hello
    *
    *
    * ��Ҫ���κ�Java���Ŀ���ӵ�classpath�У�JVM����������classpath���غ��Ŀ⣡
    * ע�⣺JVM�Դ��ı�׼��rt.jar��Ҫд��classpath�У�д�˷��������JVM���������С�  * java -cp . ��������
     *
     *
     *
     *
     *
     * jar���� zip��
     * ��package��֯��Ŀ¼�㼶���Լ�����Ŀ¼�µ������ļ�������.class�ļ��������ļ��������һ��jar�ļ�
     * ע��ѹ�����ڵ�Ŀ¼�ṹ
     * �Ӱ�����ʼ
     * jar�������԰���һ�������/META-INF/MANIFEST.MF�ļ���MANIFEST.MF�Ǵ��ı�������ָ��Main-Class��������Ϣ��
     * JVM���Զ���ȡ���MANIFEST.MF�ļ����������Main-Class�����ǾͲ�����������ָ��������������
     * ���磺java -jar hello.jar
     * jar�������԰�������jar������Ҫ��MANIFEST.MF�ļ�������classpath
     *
     * Maven���߿��Դ���jar��
     *
     *
     *
     *
     * ģ�� (jmod)
     * ��ͬ��jarֻ�Ǵ��class��������ģ�黹����class֮�������
     * ģ��֧��jar���������ϵ
     * ��һ��class��װΪjar������һ������Ĺ��̣�
     * ����һ��class��װΪģ���򲻵���Ҫ���������Ҫд��������ϵ�����һ����԰��������ƴ��루ͨ����JNI��չ����
     * ���⣬ģ��֧�ֶ�汾������ͬһ��ģ���п���Ϊ��ͬ��JVM�ṩ��ͬ�İ汾
     *
     *
     * ģ������� �� ./Java_Test/_command_projects/oop-module/module_test_cmd.bat
     *
     *
     *
    *
    * �Ƽ�ִ��class������
    * �ڵ�ǰĿ¼ִ��

    * */
}
