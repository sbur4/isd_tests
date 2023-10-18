package java_trial_test.part_2;

/**
 * 18. What will happen when you attempt to compile and run the following code?
 * <p>
 * A.Compile-time error; the try block has no matching catch clause.
 * B.Compilation and output of 20 followed by false.
 * C.Compilation and output of 20 followed by true. +
 * D.Compilation, but a runtime error as bComplete has not been initialized.
 */

public class Test18 {
    int iPayment = 10;
    static boolean bComplete;

    public static void main(String argv[]) {
        Test18 t = new Test18();
        System.out.println(t.checkParam("one"));
        System.out.println(bComplete);
    }

    public int checkParam(String param) {
        try {
            if (param.equals("one")) {
                return iPayment * 2;
            } else if (param.equals("two")) {
                return iPayment * 3;
            }
        } finally {
            bComplete = true;
        }
        return -1;
    }
}

// C