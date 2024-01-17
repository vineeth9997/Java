package Constructor;

class Bike {
    protected int num;
    public Bike(){}
    public Bike(int parentVariable) {
        this.num = num;
    }

}

class Bmw extends Bike {
    private int num1;

    public Bmw(){}
    public Bmw(int num, int num1) {

        super(num);
        this.num1 = num1;
    }

    public Bmw(int num1) {

        super(0);
        this.num1 = num1;
    }

    public int getNum() {
        return num;
    }

    public int getNum1() {
        return num1;
    }
}


public class ConstructorCheck {
    public static void main(String[] args) {

        Bmw bmw1 = new Bmw(5, 10);

        Bmw bmw2 = new Bmw(15);

        System.out.println("ChildInstance1 - Parent Variable: " + bmw1.getNum());
        System.out.println("ChildInstance1 - Child Variable: " + bmw1.getNum1());

        System.out.println("\nChildInstance2 - Parent Variable: " + bmw2.getNum());
        System.out.println("ChildInstance2 - Child Variable: " + bmw2.getNum1());
    }
}