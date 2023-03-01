package weare4saken.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import weare4saken.service.Transport;
import weare4saken.model.Moto;
import weare4saken.model.Person;

public class Main {

    public static void main(String[] args) {

        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("customPerson", Person.class);
        person.sit();

        Car car1 = context2.getBean("customCar", Car.class);
        Car car2 = context2.getBean("customCar", Car.class);
        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);

        Car car3 = context3.getBean("customCar", Car.class);
        Car car4 = context3.getBean("customCar", Car.class);
        System.out.println(car3 == car4);
        System.out.println(car3);
        System.out.println(car4);

        context.close();
        context2.close();
        context3.close();*/

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Transport moto1  = context.getBean("moto", Moto.class);
        Transport moto2 = context.getBean("moto", Moto.class);
        System.out.println(moto1 == moto2);
        System.out.println(moto1);
        System.out.println(moto2);

        moto1.go();

        Person person = context.getBean("person", Person.class);
        person.sit();

        context.close();
    }
}
