package Constructor;

final class Car {
    final int num = 10;
    final void carName() {
        System.out.println("Audi");
    }
}
public class FinalCheck {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Number: " + car.num);

        car.carName();
    }
}
