package java_trial_test.part_1;

/**
 * 8. What is the minimal modification that will make this code compile correctly?
 * <p>
 * final class Aaa { int xxx; void yyy() { xxx = 1; } }
 * <p>
 * class Bbb extends Aaa { final Aaa finalref = new Aaa();
 * <p>
 * final void yyy() { System.out.println("In method yyy()"); finalref.xxx =
 * 12345; } }
 * <p>
 * A. On line 1, remove the final modifier. +
 * B. On line 6, remove the final modifier.
 * C. Remove line 9.
 * D. On lines 1 and 6, remove the final modifier.
 * E. The code will compile as is. No modification is needed.
 */

//final class Aaa {
class Aaa { // line 1
    int xxx;

    void yyy() {
        xxx = 1;
    }
}

class Test8 extends Aaa {
    final Aaa finalref = new Aaa(); // line 6

    final void yyy() {
        System.out.println("In method yyy()");
        finalref.xxx = 12345; // line 9
    }
}

// A