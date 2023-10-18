package java_dev_test;

/**
 * 6. Let’s assume you have two classes representing some services: Service1Impl and Service2Impl. Client (represented
 * as Client1Impl class) expects to access functionality of these two services through one class: Client1Service.
 * <p>
 * A. How will you reuse functionality of Service1Impl and Service1Imp2 in
 * Client1Service?
 * B. Does Java support multiple inheritance?
 * <p>
 * Should you need to add something to this scheme, please don’t hesitate.
 * Please support your answer with a UML diagram (or using other notation).
 */

interface Service1Impl {
    public void someServices1();
}

interface Service1Impl2 {
    public void someServices2();
}

class ReuseFunction implements Service1Impl, Service1Impl2 {
    public void someServices1() {
        System.out.println("Service1Impl");
    }

    public void someServices2() {
        System.out.println("Service1Impl2");
    }
}

public class JavaDevTest6 {
    public static void main(String[] args) {
        ReuseFunction reusedFunction = new ReuseFunction();
        reusedFunction.someServices1();
        reusedFunction.someServices2();
    }
}