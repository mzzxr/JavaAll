package cn.mzzxr.javaspeciality.eight.methodreference.function;

/**
 * @Description 定义一个创建数组的函数式接口
 * @Author LG
 * @Date 2019/6/28 11:07
 **/
@FunctionalInterface
public interface ArrayBuilder {
    // 定义一个创建int类型数组的方法，参数传递数组的长度
    int[] builderArray(int length);
}
