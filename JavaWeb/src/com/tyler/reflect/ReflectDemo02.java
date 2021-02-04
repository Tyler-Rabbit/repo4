package com.tyler.reflect;

import com.tyler.domain.Person;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class p1 = Person.class;
        Field[] fields = p1.getFields();//获取所有public修饰的成员变量
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("================");
        Person person = new Person("张三", 12);
        Field a = p1.getField("a");
        a.set(person,"zhangsan");
        Object value = a.get(person);
        System.out.println(value);
        System.out.println("================");
        Field[] declaredFields = p1.getDeclaredFields();
        for (Field declaredField:declaredFields){
            System.out.println(declaredField);
        }
        System.out.println("===================");
        Field name = p1.getDeclaredField("name");
        name.setAccessible(true);//暴力反射，忽略安全检查
        name.set(person,"张三");
        Object obj = name.get(person);
        System.out.println(obj);
    }
}
