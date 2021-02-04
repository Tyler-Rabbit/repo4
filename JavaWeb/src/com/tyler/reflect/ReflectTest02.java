package com.tyler.reflect;

import com.tyler.annotation.Pro;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author tyler Rabbit
 * @version 1.01
 */
@Pro(className = "com.tyler.domain.Student",methodName = "eat")
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        //获取该类的字节码文件对象
        Class<ReflectTest02> reflectTest02Class = ReflectTest02.class;
        //获取注解对象
        Pro annotation = reflectTest02Class.getAnnotation(Pro.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
