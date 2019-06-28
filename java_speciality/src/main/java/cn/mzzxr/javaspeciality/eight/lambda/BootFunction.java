package cn.mzzxr.javaspeciality.eight.lambda;

import org.junit.Test;

import java.util.function.Function;

/**
 * @Description java.util.Function函数式接口，主要用来转换
 * @Author LG
 * @Date 2019/6/27 14:23
 **/
public class BootFunction {

    public void change(String s, Function<String, Integer> fun) {
        int in = fun.apply(s);
        System.out.println(in);

    }

    @Test
    public void testChange() {
        String s = "1234";
        change(s, (str) -> Integer.parseInt(s) + 1);
    }

    /**
     * 使用Function中的默认方法andThen
     */
    public void andThenChange(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String in = fun1.andThen(fun2).apply(s);
        System.out.println(in);
    }

    @Test
    public void testAndThenChange() {
        String s = "123";
        andThenChange(s,
                (str) -> Integer.parseInt(s),
                (in) -> String.valueOf(in + 10));
    }

    /**
     * Function练习题，自定义函数模型拼接
     */
    public Integer functionHandle(String srt,
                   Function<String,String> fun1,Function<String,Integer> fun2,
                   Function<Integer,Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(srt);

    }

    @Test
    public void testFunctionHandle() {
        String str = "宝宝，21";
        Function<String,String> fun1 = (str1) -> str1.split("，")[1];
        Function<String,Integer> fun2 = (str2) -> Integer.parseInt(str2);
        Function<Integer,Integer> fun3 = (in) -> in - 3;
        Integer age = functionHandle(str, fun1, fun2, fun3);
        System.out.println(age);
    }


}
