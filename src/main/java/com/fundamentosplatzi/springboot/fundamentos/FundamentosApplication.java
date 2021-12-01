package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.DependenciaCondependencia;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyOperacion;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependenci;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependenci componentDependenci;
	private MyBean myBean;
	private MyOperacion myOperacion;
	private DependenciaCondependencia dependenciaCondependencia;
	public FundamentosApplication(DependenciaCondependencia dependenciaCondependencia, @Qualifier("component2Implement") ComponentDependenci componentDependenci, MyBean myBean, MyOperacion myOperacion){
		this.componentDependenci = componentDependenci;
		this.myBean = myBean;
		this.myOperacion = myOperacion;
		this.dependenciaCondependencia = dependenciaCondependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependenci.saludar();
		myBean.print();
		myOperacion.suma(12 , 16);
		System.out.println("Dependenccia con dependencia");
		dependenciaCondependencia.dependenciaConDependencia();
	}
}
