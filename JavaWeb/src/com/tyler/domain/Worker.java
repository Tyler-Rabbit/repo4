package com.tyler.domain;

import com.tyler.annotation.MyAnno01;
import com.tyler.annotation.MyAnno02;

@MyAnno01("tyler")
@MyAnno02
public class Worker {
    @MyAnno02
    public void method(){
    }
    @MyAnno02
    public Person p = new Person();
}
