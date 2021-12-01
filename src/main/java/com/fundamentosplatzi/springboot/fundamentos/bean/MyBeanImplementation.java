package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplementation implements MyOperacion{
    @Override
    public void suma(int n1, int n2) {
        System.out.println(n1 + " + " + n2 +" = "+ (n1+n2));
    }
}
