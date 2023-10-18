package java_trial_test.part_1;

/**
 * 3. Given:
 * <p>
 * class test { int x; public static void main ( String [] args ) { final int i;
 * i = 127; byte b = i; System.out.println(b); } }
 * <p>
 * A. Compile error: loss of precision +
 * B. No error. Compiles fine. Prints 0
 * C. Runtime error
 * D. Compiles with a warning
 * E. No error. Compiles fine. Prints 127
 */

public class Test3 {
    int x;

    public static void main(String[] args) {
        final int i;
        i = 127;
//        byte b = i;
//        System.out.println(b);
    }
}

// A