package cn.mzzxr.javaall.javaspeciality.methodreference;

import cn.mzzxr.javaall.javaspeciality.methodreference.function.Printable;
import org.junit.Test;

/**
 * @Description 方法引用
 * @Author LG
 * @Date 2019/6/28 9:30
 **/
public class BootMethodReference {

    public void printString(String s,Printable printable) {
        printable.print(s);
    }
    @Test
    public void testPrintString() {
        printString("Hello,world!",str-> System.out.println(str));

        /*
        分析：
            lambda表达式的目的，打印参数传递字符串
            把参数s,传递给了System.out对象，调用out对象中的方法println对字符串进行输出
            注意:
                1.System.out对象是已经存在的
                2.println方法也是已经存在的
            所以我们可以慎用方法引用来优化lambda表达式
            可以使用System.out方法直接调用println方法
     */
        printString("Hello,world", System.out::println);
    }
}
