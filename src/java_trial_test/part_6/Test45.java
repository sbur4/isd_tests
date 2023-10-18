package java_trial_test.part_6;

/**
 * 45. Fill all the blanks from the following? (You need to provide an answer for each A,B,C,D option)
 * <p>
 * Math.abs(3.0) returns 3.0
 * Math.abs(-3.4) returns ____ = 3.4
 * <p>
 * Math.ceil(3.4) returns ____ = 4
 * Math.ceil(-3.4) returns -3.0
 * <p>
 * Math.floor(3.4) returns ____ = 3
 * Math.floor(-3.4) returns -4.0
 * <p>
 * Math.round(3.4) returns 3
 * Math.round(-3.4) returns ____ = 3
 */

public class Test45 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.4)); // 3.4
        System.out.println(Math.ceil(3.4)); // 4.0
        System.out.println(Math.floor(3.4)); // 3.0
        System.out.println(Math.round(-3.4)); // -3
    }
}