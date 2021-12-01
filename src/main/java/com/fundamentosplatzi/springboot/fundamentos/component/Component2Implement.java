package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Component2Implement implements ComponentDependenci{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el segundo componente");
    }
}
