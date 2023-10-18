package java_trial_test.part_1;

/**
 * 6. Consider the following code:
 * <p>
 * StringBuffer sbuf = new StringBuffer(); sbuf = null; System.gc();
 * <p>
 * A. Choose all true statements:
 * B. After line 2 executes, the StringBuffer object is garbage collected.
 * C. After line 3 executes, the StringBuffer object is garbage collected.
 * D. After line 2 executes, the StringBuffer object is eligible for garbage collection. +
 * E. After line 3 executes, the StringBuffer object is eligible for garbage collection. +
 * F. None of the above
 */

public class Test6 {
    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer();
        sbuf = null; // line 2
        System.gc(); //  line 3
    }
}

// D + E