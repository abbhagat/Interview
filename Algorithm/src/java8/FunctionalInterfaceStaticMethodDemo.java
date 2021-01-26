package java8;

interface StaticAndDefaultMethodInterface{

    default void print(String str) {
        if (!isNull(str))
            System.out.println("Inside Default Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}

public class FunctionalInterfaceStaticMethodDemo implements StaticAndDefaultMethodInterface{

    static boolean isNull(String str) {
        System.out.println("Impl Null Check");
        return str == null ? true : false;
    }

    public static void main(String args[]){
        FunctionalInterfaceStaticMethodDemo obj = new FunctionalInterfaceStaticMethodDemo();
        obj.print("");
        obj.isNull("abc");
    }
}
