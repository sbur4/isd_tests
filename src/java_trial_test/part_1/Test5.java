package java_trial_test.part_1;

/**
 * 5. How many String objects are created in the following code?
 * <p>
 * String A, B, C ; A = new String( "1234" ) ; B = A ; C = A + B ;
 * <p>
 * A. One
 * B. Two  +
 * C. Three
 * D. Four
 */

public class Test5 {
    public static void main(String[] args) {
        String A, B, C;
        A = new String("1234"); //
        B = A;
        C = A + B; //
        System.out.println(C);
    }
}

// B