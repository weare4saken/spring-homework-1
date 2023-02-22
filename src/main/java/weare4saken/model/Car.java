package weare4saken.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import weare4saken.service.Transport;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport {

    @Override
    public void go() {
        System.out.println("Автомобиль едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Car: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Car: destroy method");
    }

}

