package dynamicproxy;

/**
 * Created by gordon on 16/9/21.
 */
public class RealOperationOne implements Operation {
    public final static String TAG = "RealOperationOne";

    public void add() {
        System.out.println("RealOperationOne");
    }
}
