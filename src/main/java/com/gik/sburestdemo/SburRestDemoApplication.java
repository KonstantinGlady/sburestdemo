package com.gik.sburestdemo;

import com.gik.sburestdemo.ch5_prop.Droid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SburRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SburRestDemoApplication.class, args);
    }

    //если нужно добавить проперти для внешнего бина создаем класс прописываем настройки в application.prop
    @Bean
    @ConfigurationProperties(prefix = "droid")
    Droid getDroid() {
        return new Droid();
    }

}
