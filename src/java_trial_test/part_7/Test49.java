package java_trial_test.part_7;

/**
 * 49. Here is realization of singleton pattern:
 * <p>
 * public class MySingleton { private static MySingleton _instance = null;
 * public static MySingleton getInstance() { if (_instance == null) { _instance
 * = new MySingleton(); } return _instance; } }
 * <p>
 * What kind of problems can lead such realization? [Check all correct answers]
 * <p>
 * A. User can create different instances of MySingleton class form single thread
 * B. User can create different instances of MySingleton class from several threads +
 * C. NullpointerException rises when method MySingleton.getInstance() will be invoked
 * D. Code will not compile
 * <p>
 * ----------------------------------------------------------------
 * What should be done to prevent it? [Check all correct answers]
 * <p>
 * A. Add following line after line 3: +
 * 4. private MySingleton() {}
 * <p>
 * B. Add following line after line 7 instead of line8:
 * 8. synchronized (MySingleton.class) {
 * 9. if (_instance == null) {
 * 10. _instance = new MySingleton();
 * 11. }
 * <p>
 * C. Modify line 4 in this way:
 * 4. public synchronized static MySingleton getInstance()
 * <p>
 * D. Add following line after line 7 instead of line8:
 * 8. synchronized (this) {
 * 9. _instance = new MySingleton();
 * 10. }
 *
 * E. Modify line 3in this way:
 * 3. private volatile static MySingleton _instance = null;
 */

// B
// A + B + E