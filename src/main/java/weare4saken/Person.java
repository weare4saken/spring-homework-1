package weare4saken;

public class Person {

    private Car car;

    public void sit() {
        System.out.println("Водитель сел в автомобиль");
        car.go();
    }
}
