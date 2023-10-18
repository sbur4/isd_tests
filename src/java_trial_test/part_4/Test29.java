package java_trial_test.part_4;

/**
 * Part 4. Converting and Casting Primitives and Objects
 * <p>
 * 29. What will happen when you try to compile the following code?
 * <p>
 * public void printArray( Object x ){ if( x instanceof int[] ){ int[] n =
 * (int[]) x ; for( int i = 0 ; i < n.length ; i++ ) {
 * System.out.println(″integers = ″ + n[i] );} } if( x instanceof String[] ){
 * System.out.println(″Array of Strings″) ; } }
 * <p>
 * A. It compiles without error. +
 * B. The compiler objects to line 2, which compares an Object with an array.
 * C. The compiler objects to line 3, which casts an Object to an array of int primitives.
 * D. The compiler objects to line 7, which compares an Object to an array of Objects.
 */

public class Test29 {
    public void printArray(Object x) {
        if (x instanceof int[]) {
            int[] n = (int[]) x;
            for (int i = 0; i < n.length; i++) {
                System.out.println("integers = " + n[i]);
            }
        }
        if (x instanceof String[]) {
            System.out.println("Array of Strings");
        }
    }
}

// A