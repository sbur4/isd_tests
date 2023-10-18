package java_trial_test.part_1;

/**
 * 4. What will be the result of calling the following method with an input of 2?
 * <p>
 * public int adder( int N ){ return 0x100 + N++ ; }\
 * <p>
 * A. The method will return 258. +
 * B. The method will return 102.
 * C. The method will return 259.
 * D. The method will return 103.
 * <p>
 * - 0 represents zero in both decimal and hexadecimal.
 * - x is just a prefix to indicate that the following characters represent a hexadecimal number.
 * - 100 in hexadecimal is equivalent to 256 in decimal.
 */

public class Test4 {
    public static int adder(int N) {
        return 0x100 + N++; // 256+2
    }

    public static void main(String[] args) {
        System.out.println(adder(2));
    }
}

// A