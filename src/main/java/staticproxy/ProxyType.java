package staticproxy;

/**
 * Created by gordon on 16/9/21.
 */
public class ProxyType implements ProtoType {

    private RealType realType;

    public ProxyType(RealType realType) {
        this.realType = realType;
    }

    public void request() {
        System.out.println("additional action before");
        realType.request();
        System.out.println("additional action after");
    }
}
