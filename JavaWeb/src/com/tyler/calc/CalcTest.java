package com.tyler.calc;

import com.tyler.annotation.Check;

import java.io.*;
import java.lang.reflect.Method;

public class CalcTest {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        Class cls = calc.getClass();
        Method[] methods = cls.getMethods();
        int num =0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method:methods){
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(calc);
                }catch (Exception e){
                    num++;
                    bufferedWriter.write(method.getName()+"方法出现了异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称："+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因："+e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("----------------------------");
                }
            }
        }
        bufferedWriter.write("本次一共出现"+num+"次异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
