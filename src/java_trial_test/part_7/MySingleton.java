package java_trial_test.part_7;

// 1.	public  class MySingleton
// 2.	{
// 3.	    private static MySingleton _instance = null;
// 4.	    public static MySingleton getInstance()
// 5.	   {
// 6.	        if (_instance == null)
// 7.	        {
// 8.	             _instance = new MySingleton();
// 9.	         }
// 10.	         return _instance;
// 11.	    }
// 12.	 }

public class MySingleton {
    // E Modify line 3in -
    //private volatile static MySingleton _instance = null;
    private static MySingleton _instance = null;

    // A after line 3
    private MySingleton() {}
    // C Modify line 4
    // public synchronized static MySingleton getInstance()
    public static MySingleton getInstance() {
        // B after line 7 instead of line8
        // synchronized (MySingleton.class) {
        if (_instance == null) {
             _instance = new MySingleton();
            // synchronized (MySingleton.class) { _instance = new MySingleton();}}
            // D line 7 instead of line8
            // synchronized (this) {_instance = new MySingleton();}

        }
        return _instance;
    }
}