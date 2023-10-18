package java_trial_test.part_6;

/**
 * 41. Suppose you want to write a class that offers static methods to compute hyperbolic trigonometric functions.
 * You decide to subclass java.lang.Math and provide the new functionality as a set of static methods.
 * Which one statement is true about this strategy?
 * <p>
 * A. The strategy works. +
 * B. The strategy works, provided the new methods are public.
 * C. The strategy works, provided the new methods are not private.
 * D. The strategy fails because you cannot subclass java.lang.Math.
 * E. The strategy fails because you cannot add static methods to a subclass
 */
public class Test41 {

    public static void main(String[] args) {
        double rads, degs, sinHA, cosHA, tanHA, asinHA;

        // Obtain angle in degrees from user
        degs = 20d;
        // Convert degrees to radian
        rads = Math.toRadians(degs);
        // Calculate hyperbolic sine
        sinHA = (Math.exp(rads) - Math.exp(-rads)) / 2;
        System.out.println("Hyperbolic sine = " + sinHA);
        // Calculate Hyperbolic cosine
        cosHA = (Math.exp(rads) + Math.exp(-rads)) / 2;
        System.out.println("Hyperbolic cosine = " + cosHA);
        // Calculate hyperbolic tangent
        tanHA = sinHA / cosHA;
        System.out.println("Hyperbolic tangent = " + tanHA);
        // Calculate hyperbolic arc-sine
        asinHA = Math.log(sinHA + Math.sqrt((sinHA * sinHA) + 1.0));
        degs = Math.toDegrees(asinHA);
        System.out.println("Arc hyperbolic sine = " + degs);
    }
}

// A