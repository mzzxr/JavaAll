package cn.mzzxr.javaall.javaspeciality.eight.methodreference;

import cn.mzzxr.javaall.javaspeciality.eight.methodreference.function.Printable;
import org.junit.Test;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/6/28 9:55
 **/
public class MethodRerObject {
    // 定义一个成员方法
    public void printUpperCaseString(String str) {
        System.out.println(str.toUpperCase());
    }

    public void printString(Printable p) {
        p.print("hello");
    }

    @Test
    public void testPrintString() {
        printString(s -> {
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpperCaseString(s);
        });
        /**
         * 使用方法引用
         * 对象已经存在，成员方法已经存在
         * 所以可以使用对象名来引用成员方法
         */
        MethodRerObject methodRerObject = new MethodRerObject();
        printString(methodRerObject::printUpperCaseString);
    }

}
