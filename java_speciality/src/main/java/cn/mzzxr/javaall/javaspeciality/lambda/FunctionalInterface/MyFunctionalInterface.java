package cn.mzzxr.javaall.javaspeciality.lambda.FunctionalInterface;

/**
 * @Description 函数式接口，有且只有一个抽象方法的接口，称之为函数式接口。
 * @Author LG
 * @Date 2019/6/19 13:04
 **/
/* @FunctionalInterface 注解
 * 作用：可以检测接口是否是一个函数式接口
 *      是：编译成功
 *      否：编译失败（接口中没有抽象方法，或抽象方法的个数多余一个）
 * */
@FunctionalInterface
public interface MyFunctionalInterface {
    // 定义一个抽象方法
    void method();
}
