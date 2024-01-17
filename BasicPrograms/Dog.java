package BasicPrograms;

public class Dog extends Animal{
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();

        dog.makeSound();
    }
}
