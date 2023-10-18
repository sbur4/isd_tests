package java_trial_test.part_2;

/**
 * 13. Here is a test method:
 * <p>
 * String test( int n ){ String tmp = "?" ; if( n < 3 ) n-- ; switch( n ){ case
 * 1 : return "one" ; case 2 : n = 3 ; case 3 : break ; case 4 : default :
 * return tmp ; } return "Result " + n ; }
 * <p>
 * Which of the options correctly describes the input and returned value from this method? [Check all correct answers.]
 * <p>
 * A. Input 1 - Return = “ one ”
 * B. Input 2 - Return = “ Result 3 ”
 * C. Input 3 - Return = “ Result 3 ” +
 * D. Input 4 - Return = “ ? ” +
 * E. Input 5 - Return = “ ? ” +
 */

public class Test13 {
    String test(int n) {
        String tmp = "?";
        if (n < 3)
            n--;
        switch (n) {
            case 1:
                return "one";
            case 2:
                n = 3;
            case 3:
                break;
            case 4:
            default:
                return tmp;
        }
        return "Result " + n;
    }


    public static void main(String[] args) {
        Test13 test = new Test13();
//        System.out.println(test.test(1)); // ?
//        System.out.println(test.test(2)); // "one"
//        System.out.println(test.test(3)); // Result 3
//        System.out.println(test.test(4)); // ?
//        System.out.println(test.test(5)); // ?
    }
}

// C + D + E