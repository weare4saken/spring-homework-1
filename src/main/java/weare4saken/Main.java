package weare4saken;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean("customCar", Car.class);
        car.go();

        context.close();

    }
}
