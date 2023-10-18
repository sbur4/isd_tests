package java_trial_test.part_3;

/**
 * 24. Suppose class Lemon extends class Citrus. Given the following code:
 * <p>
 * Which line compiles without error?
 * <p>
 * A. lem = cit;
 * B. cit = lem;
 * C. lem = (Citrus)cit;
 * D. cit = (Lemon)lem;
 * E. cit = (Object)lem;
 */

public class Test24 {

    class Citrus {
        Citrus cit = new Citrus();
    }

    class Lemon extends Citrus {
        Lemon lem = new Lemon();
    }

    public static void main(String[] args) {
    }
}

// None of the lines (A, B, C, D, E) will compile without error.