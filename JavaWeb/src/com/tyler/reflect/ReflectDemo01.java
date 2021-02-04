package com.tyler.reflect;

import com.tyler.domain.Person;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("com.tyler.domain.Person");
        Class cls2 = Person.class;
        Person teacher = new Person();
        Person student = new Person();
        Class cls3 = teacher.getClass();
        Class cls4 = student.getClass();
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println("================");
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
        System.out.println(cls1==cls4);

    }
}
