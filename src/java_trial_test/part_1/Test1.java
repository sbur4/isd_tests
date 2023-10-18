package java_trial_test.part_1;

/**
 * Part 1. Language fundamentals:
 * <p>
 * 1. What will be the result of trying to compile and run an application in which the following is the only declaration
 * of a main method? (Assume the rest of the class is correct):
 * <p>
 * public static void main(){ System.out.println("hello world"); }
 * <p>
 * A. The class will compile without error but the program will not run.
 * B. The class will compile and run, writing "hello world" to the standard output.
 * C. The compiler will report an error. +
 * D. The compiler will report an error but the program will run fine.
 */
public class Test1 {
    public static void main() {
        System.out.println("hello world");
    }
}

// C