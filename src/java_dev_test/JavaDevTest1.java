package java_dev_test;

/**
 * 1. Please give different possible implementations of the interface
 * <p>
 * public interface ISampleInterface { void doWork(MyParam myParam) throws
 * MyException;}
 */

public class JavaDevTest1 {
    public static void main(String[] args) throws Exception {
        new JavaDevTest1().doWork(() -> System.out.println("work"));
    }

    public void doWork(MyParam myParam) {
        System.out.println("doWork");
        myParam.work();
    }

    public interface MyParam {
        void work();
    }

}