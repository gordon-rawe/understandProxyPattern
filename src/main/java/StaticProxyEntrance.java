import staticproxy.ProtoType;
import staticproxy.ProxyType;
import staticproxy.RealType;

/**
 * Created by gordon on 16/9/21.
 */
public class StaticProxyEntrance {
    public static void main(String[] args) {
        ProtoType oneProto = new ProxyType(new RealType());
        oneProto.request();
    }
}
