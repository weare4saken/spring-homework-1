package weare4saken;

public class Person {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void sit() {
        System.out.println("Водитель сел в автомобиль");
        car.go();
    }
}
