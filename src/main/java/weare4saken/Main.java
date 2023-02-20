package weare4saken;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
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
        context3.close();

    }
}
