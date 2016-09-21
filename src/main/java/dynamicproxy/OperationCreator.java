package dynamicproxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by gordon on 16/9/21.
 */
@SuppressWarnings("unchecked")
public class OperationCreator {
    public static <T> T create(final Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, args);
                }
                /**
                 * default to real operation one.
                 * */
                T subject = (T) new RealOperationOne();
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    if (annotation instanceof OperateType) {
                        OperateType operateType = (OperateType) annotation;
                        if (operateType.type().equals(RealOperationOne.TAG)) {
                            subject = (T) new RealOperationOne();
                        } else if (operateType.type().equals(RealOperationTwo.TAG)) {
                            subject = (T) new RealOperationTwo();
                        } else if (operateType.type().equals("extend")) {
                            System.out.println("nothing happened just return empty");
                            return "";
                        }
                    }
                }
                return method.invoke(subject, args);
            }
        });
    }
}
