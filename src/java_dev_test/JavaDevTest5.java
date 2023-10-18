package java_dev_test;

/**
 * 5. Can you please give examples of design patterns implemented in a standard Java API? +
 */

public class JavaDevTest5 {

    /*
     * java.lang.Runtime: In every Java application there is only one Runtime instance that allows the application
     * to interface with the environment it is running. The getRuntime is equivalent to the getInstance() method of the
     * singleton class.
     * <p>
     * The Model-View-Controller design pattern is used extensively throughout the Swing API.
     * <p>
     * The getInstance() method in java.util.Calendar is an example of a simple form of the Factory Method design
     * pattern.
     * <p>
     * The classes java.lang.System and java.sql.DriverManager are examples of the Singleton pattern, although they
     * are not implemented using the approach recommended in the GoF book but with static methods.
     * <p>
     * The Prototype pattern is supported in Java through the clone() method defined in class Object and the use of
     * java.lang.Cloneable interface to grant permission for cloning.
     * <p>
     * The Java Swing classes support the Command pattern by providing an Action interface and an AbstractAction class.
     * <p>
     * The Java 1.1 event model is based on the observer pattern. In addition, the  interface java.util.Observable
     * and the class java.util.Observer provide support for this pattern.
     * <p>
     * The Adapter pattern is used extensively by the adapter classes in java.awt.event.
     * <p>
     * The Proxy pattern is used extensively in the implementation of Java’s Remote Method Invocation (RMI) and
     * Interface Definition Language (IDL) features.
     * <p>
     * The structure of Component and Container classes in java.awt provide a good example of the Composite pattern.
     * <p>
     * The Bridge pattern can be found in the separation of the components in java.awt (e.g., Button and List),
     * and their counterparts in java.awt.peer.
     */
}