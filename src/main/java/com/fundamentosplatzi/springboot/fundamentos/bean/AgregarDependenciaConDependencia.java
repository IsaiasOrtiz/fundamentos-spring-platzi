package com.fundamentosplatzi.springboot.fundamentos.bean;

public class AgregarDependenciaConDependencia implements DependenciaCondependencia{

    private  MyOperacion myOperacion;

    public AgregarDependenciaConDependencia(MyOperacion myOperacion){
        this.myOperacion = myOperacion;
    }

    @Override
    public void dependenciaConDependencia() {
        System.out.println("Dependencia con dependencia");
        myOperacion.suma(12,9);
        System.out.println("Dependencia 2 ");
    }
}
