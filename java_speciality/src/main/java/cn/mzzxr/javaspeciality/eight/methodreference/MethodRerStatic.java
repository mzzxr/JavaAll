package cn.mzzxr.javaspeciality.eight.methodreference;

import cn.mzzxr.javaspeciality.eight.methodreference.function.Calcable;
import org.junit.Test;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/6/28 10:18
 **/
public class MethodRerStatic {

    public int method(int number, Calcable calcable) {
        return calcable.calsAbs(number);
    }

    @Test
    public void testMethod() {
        int number = method(-10, n -> {
            return Math.abs(n);
        });
        System.out.println(number);
        /*
            使用方法医用优化lambda表达式
            Math类已经存在
            abs也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        method(-10, Math::abs);
    }

}
