package dynamicproxy;

/**
 * Created by gordon on 16/9/21.
 */
public class RealOperationTwo implements Operation {

    public final static String TAG = "RealOperationTwo";

    public void add() {
        System.out.println("RealOperationTwo");
    }
}
