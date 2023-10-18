package java_trial_test.part_6;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 44. Given:
 * <p>
 * TreeSet map = new TreeSet(); map.add("one"); map.add("two");
 * map.add("three"); map.add("four"}; map.add("one"); Iterator it =
 * map.iterator(); while (it.hasNext() ) { System.out.print( it.next() + " " );
 * }
 * <p>
 * What is the result?
 * <p>
 * A. Compilation fails. +
 * B. one two three four
 * C. four three two one
 * D. four one three two -if change } +
 * E. one two three four one
 * F. one four three two one
 * G. An exception is thrown at runtime.
 * H. The print order is not guaranteed.
 */

public class Test44 {
    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        // TreeSet<String> map = new TreeSet<String>();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");

        Iterator it = map.iterator();
        // Iterator<String> it = map.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}

// A + D