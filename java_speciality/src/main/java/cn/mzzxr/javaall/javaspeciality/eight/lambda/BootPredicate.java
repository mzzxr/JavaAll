package cn.mzzxr.javaall.javaspeciality.eight.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description 提供判断的函数式接口，返回布尔类型
 * @Author LG
 * @Date 2019/6/24 16:32
 **/

/**
 * 对某种数据类型的数据进行判断，结果返回一个boolean
 * boolean test(); 用来对指定数据类型进行判断的方法
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

    /**
     * 使用Predicate中的默认方法and
     */
    public boolean andCheckString(String s, Predicate<String> p1, Predicate<String> p2) {
        return p1.and(p2).test(s);
    }

    @Test
    public void testAndCheckString() {
        final boolean flag = andCheckString("lili ai niuniu",
                (str) -> str.contains("lili"),
                (str) -> str.contains("niuniu"));
        System.out.println(flag);
    }

    /**
     * 使用Predicate中的默认方法or
     */
    public boolean orCheckString(String s, Predicate<String> p1, Predicate<String> p2) {
        return p1.or(p2).test(s);
    }

    @Test
    public void testOrCheckString() {
        boolean flag = orCheckString("niuniu shi shangdi",
                (str) -> str.contains("niuniu"),
                (str) -> str.contains("shangdi"));
        System.out.println(flag);
    }

    /**
     * 使用Predicate中的默认方法negate
     */
    public boolean negateCheckString(String s, Predicate<String> p1) {
        return p1.negate().test(s);
    }

    @Test
    public void testNegateCheckString() {
        boolean flag = negateCheckString("niuniu", (str) -> str.length()>5);
        System.out.println(flag);
    }

    /**
     * Predicate练习题
     */
    public List<String> checkArray(String[] arr, Predicate<String> p1, Predicate<String> p2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = p1.and(p2).test(s);
            if (b) {
                list.add(s);
            }

        }
        return list;
    }

    @Test
    public void testCheckArray() {
        String[] arrays = {"迪丽热巴，女", "古力娜扎，女", "马尔扎哈，男", "赵丽颖，女"};
        Predicate<String> p1 = (str) -> str.split("，")[0].length() == 4;
        Predicate<String> p2 = (str) -> str.split("，")[1].equals("女");
        List<String> list = checkArray(arrays, p1, p2);
        System.out.println(list);
    }
}
