package java_trial_test.part_3;

/**
 * 20. When you try to compile the following source code, it produces a compiler warning to the effect that the
 * variable tmp may not have been initialized:
 * <p>
 * Which of the following changes would eliminate this warning? [Check all correct answers]
 * <p>
 * A. Make line 4 read: String tmp = null ; +
 * B. Make line 4 read: String tmp = " " ;
 * C. Insert a line following line 5: else tmp = "not positive" ; +
 * D. Remove line 4 and insert a new line after 2 so tmp becomes a member variable instead of a local variable in
 * showType: String tmp ;
 */

class Test20 {
    String msg = "Type is ";

    public void showType(int n) {
        String tmp;
        if (n > 0)
            tmp = "positive";
        else
            tmp = "not positive";

        System.out.println(msg + tmp);
    }
}

// A + C