package dynamicproxy;

/**
 * Created by gordon on 16/9/21.
 */
public interface Operation {
    @OperateType(type = "extend")
    void add();
}
