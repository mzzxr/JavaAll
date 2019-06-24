package cn.mzzxr.javaspeciality.eight.lambda;

import org.junit.Test;

import java.util.function.Predicate;

/**
 * @Description 提供判断的函数式接口，返回布尔类型
 * @Author LG
 * @Date 2019/6/24 16:32
 **/

/**
 * 对某种数据类型的数据进行判断，结果返回一个boolean
 *      boolean test(); 用来对指定数据类型进行判断的方法
 */
public class BootPredicate {

    public boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    @Test
    public void testCheckString() {
        final boolean flag = checkString("niuniu ai lili", (str) -> str.contains("ai"));
        System.out.println(flag);
    }



}
