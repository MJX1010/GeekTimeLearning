package com.tm.apitest.annotation;

import java.lang.annotation.*;


/*
* Ԫע��  @Inherited  ���� �����Ƿ���Լ̳и��ඨ���  Annotation
*
* �����@Target(ElementType.TYPE)���͵�annotation��Ч�����ҽ����class�ļ̳У���interface�ļ̳���Ч
*
*   ʹ�ó���
*   @Report(type=1)
    public class Person {
    }

    public class Student extends Person {
    }
*
* */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
