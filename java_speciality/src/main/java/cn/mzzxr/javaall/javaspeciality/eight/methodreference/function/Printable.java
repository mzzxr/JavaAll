package cn.mzzxr.javaall.javaspeciality.eight.methodreference.function;

/**
 * @Description 定义一个打印的函数式接口
 * @Author LG
 * @Date 2019/6/28 9:28
 **/
@FunctionalInterface
public interface Printable {
    // 打印字符串的抽象方法
    void print(String s);
}
