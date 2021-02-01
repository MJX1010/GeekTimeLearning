package com.tm.apitest.annotation;

import java.lang.annotation.*;


/*
* Ԫע��  @Target   ���� Annotation �ܹ���Ӧ���� Դ�����Щλ��
*
*   ���ӿڣ�ElementType.TYPE��
    �ֶΣ�ElementType.FIELD��
    ������ElementType.METHOD��
    ���췽����ElementType.CONSTRUCTOR��
    ����������ElementType.PARAMETER

*   @Target({
    ElementType.METHOD,
    ElementType.FIELD
    })   ���{} �γ�ע������  ��ԭ���ǣ�@Target�����value��ElementType[]���飬ֻ��һ��Ԫ��ʱ������ʡ�������д��
*
*
* Ԫע��   @Retention  ���� Annotation ����������
*
*   �������ڣ�RetentionPolicy.SOURCE��
    ��class�ļ���RetentionPolicy.CLASS��
    �����ڣ�RetentionPolicy.RUNTIME

*
*
* Ԫע��  @Repeatable  ���� Annotation �Ƿ���ظ�
*
* ע�⣺���� Annotation �� Ԫע��Ҫ�͵��� Anonation ����һ��  ��Ȼ @Repeatable ������üӵ���������
*
* */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Checks.class)
public @interface Check {
    int min() default 0;
    int max() default  100;
    int value() default 0;
}

