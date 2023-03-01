package weare4saken.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import weare4saken.service.Transport;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Moto implements Transport {

    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Moto: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Moto: destroy method");
    }

}
