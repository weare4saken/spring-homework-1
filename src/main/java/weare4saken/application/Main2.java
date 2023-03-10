package weare4saken.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import weare4saken.service.Transport;
import weare4saken.config.Config;
import weare4saken.model.Car;
import weare4saken.model.Person;

public class Main2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Transport car1 = context.getBean("car", Car.class);
        Transport car2 = context.getBean("car", Car.class);
        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);

        context.close();

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
        Person person = context1.getBean("person", Person.class);
        person.sit();

        context1.close();

    }
}
