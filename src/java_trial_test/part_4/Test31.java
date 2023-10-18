package java_trial_test.part_4;

/**
 * 31. Suppose you have an ApBase class declared as: class ApBase extends Object implements Runnable
 * <p>
 * The following code fragment takes a reference to an ApBase object and assigns it to a variety of variables:
 * <p>
 * ApBase aBase = new ApBase(); Runnable aR = aBase; Object obj = aR;ApBase x = (ApBase)obj;
 * <p>
 * What will happen when you try to compile and run this code?
 * <p>
 * A. The compiler objects to line 2.
 * B. The compiler objects to line 3.
 * C. The code compiles but, when run, it throws a ClassCastException in line 4.
 * D. The code compiles and runs without a problem. +
 *
 */

 // D