package java8;

interface I1 {

    void display();

    default void defaultMethod() {
        System.out.println("Default Method of I1");
    }

    static void staticMethod() {
        System.out.println("Static Method of I1");
    }
}


interface I2 {

    void display();

    default void defaultMethod() {
        System.out.println("Default Method of I2");
    }

    static void staticMethod() {
        System.out.println("Static Method of I2");
    }
}

class A implements I1, I2 {

    @Override
    public void display() {
        System.out.println("A display() method called");
    }

    @Override
    public void defaultMethod() {
        I1.staticMethod();
        I2.staticMethod();
    }
}

public class FunctionalInterfaceInheritanceDemo {

    public static void main(String[] args) {
        I1 a = new A();
        a.display();
        a.defaultMethod();
    }
}
