package java_trial_test.part_1;

/**
 * 2. Consider the following line of code:
 * <p>
 * int[] x = new int[25];
 * <p>
 * After execution, which statement is true?
 * A. x[24] is null
 * B. x[24] is undefined
 * C. x[25] is 0
 * D. x[0] is null
 * E. x.length is 25. +
 */

public class Test2 {
    public static void main(String[] args) {
        int[] x = new int[25];
        System.out.println(x.length);
    }
}

// E