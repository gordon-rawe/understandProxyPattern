import dynamicproxy.Operation;
import dynamicproxy.OperationCreator;

/**
 * Created by gordon on 16/9/21.
 */
public class DynamicProxyEntrance {
    public static void main(String[] args) {
        OperationCreator.create(Operation.class).add();
//        OperationCreator.create(Operation.class).add();
    }
}
