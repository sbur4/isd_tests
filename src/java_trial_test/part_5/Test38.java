package java_trial_test.part_5;

/**
 * 38. If you attempt to compile and execute the following application, will it ever print out the message In xxx?
 * <p>
 * A. Yes +
 * B. No
 */

public class Test38 extends Thread {
    public void run() {
        System.out.println("Running");
        System.out.println("Done");
    }

    private void xxx() {
        System.out.println("In xxx");
    }

    public static void main(String args[]) {
        Test38 ttt = new Test38();
        ttt.xxx();
        ttt.start();
    }
}

// A