package java_trial_test.part_2;

/**
 * 17. Given:
 * <p>
 * class test {test() {try{throw new RuntimeException();}
 * finally{System.out.print("Damn ! ");}
 * }public static void
 * main( String args[] ){try{new test();}catch ( Throwable t){System.out.print("Caught");}}}
 * <p>
 * What is the output?
 * <p>
 * A. Damn ! RuntimeException
 * B. Damn ! Caught RuntimeException
 * C. RuntimeException caught
 * D. Damn ! Caught +
 * E. Caught
 * F. None of the above
 */

class Test17 {
    Test17() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.print("Damn ! ");
        }
    }

    public static void main(String args[]) {
        try {
            new Test17();
        } catch (Throwable t) {
            System.out.print("Caught");
        }
    }
}

// D