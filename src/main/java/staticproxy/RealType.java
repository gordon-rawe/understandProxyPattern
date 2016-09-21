package staticproxy;

/**
 * Created by gordon on 16/9/21.
 */
public class RealType implements ProtoType {

    public void request() {
        System.out.println("hello from RealType");
    }
}
