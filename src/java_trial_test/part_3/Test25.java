package java_trial_test.part_3;

import java.util.HashMap;
import java.util.Map;

/**
 * 25. Given:
 * <p>
 * Choose all that apply.
 * <p>
 * A. Prints 1
 * B. Prints 2 +
 * C. If Line 1 is replaced with return true; then m.size() returns 1.
 * D. If hashCode() is not overridden then regardless of whether line 1 returns true or false 2 will be printed
 * on the screen.
 * E. Compile time error
 * F. Runtime exception is encountered.
 * G. If Line 1 is replaced with return true; then size() will not return any number greater than 1.
 */

class Test25 {
    public static void main(String args[]) {
        Map m = new HashMap();
        String str = null;
        m.put(new Test25(), "mill");
        m.put(new Test25(), "sill");
        System.out.println(m.size());
    }

    public boolean equals(Object o) {
        return false; // 1
    }

    public int hashCode() {
        return 0;
    }
}

// B