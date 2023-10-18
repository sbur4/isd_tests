package java_trial_test.part_3;

/**
 * 21. Look at the following class definition:
 * <p>
 * Which of the following constructor signatures must exist in the Demo class for DerivedDemo to compile correctly?
 * [Check all correct answers.]
 * <p>
 * A. public Demo( int a, int b ) +
 * B. public Demo( int c ) +
 * C. public Demo( ) +
 * D. There is no requirement for a constructor in Demo.
 */

public class Test21 extends Demo {
    int M, N, L;

//    public Test21(int x, int y) {
//        M = x;
//        N = y;
//    }

    public Test21(int x) {
        super(x);
    }
}

// A + B + C