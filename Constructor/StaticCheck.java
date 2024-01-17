package Constructor;

public class StaticCheck {
    private static int num = 10;
    public static int getNum() {
        return num;
    }
    public static void main(String[] args) {

        System.out.println("Static Variable: " + StaticCheck.num);
        System.out.println("Static Method Result: " + StaticCheck.getNum());
    }
}
