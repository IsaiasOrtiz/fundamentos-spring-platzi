package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }


    @Bean
    public MyOperacion beanOperation2(){
        return new MyBeanImplementation();
    }

    @Bean
    public DependenciaCondependencia beanOperationConOtraDependencia(MyOperacion myOperacion){
        return new AgregarDependenciaConDependencia(myOperacion);
    }

}
