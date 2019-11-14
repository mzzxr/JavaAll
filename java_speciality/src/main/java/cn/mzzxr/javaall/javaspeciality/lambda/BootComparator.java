package cn.mzzxr.javaall.javaspeciality.lambda;

/**
 * @Description Comparator与lambda
 * @Author LG
 * @Date 2019/6/21 13:06
 **/

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个lambda表达式
 * 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器是，就可以调用该方法获取
 */
public class BootComparator {
    // 定义一个方法，方法的返回值类型使用函数式接口Comparator
     public Comparator<String> getComparator() {
         // 方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
//         return new Comparator<String>() {
//             @Override
//             public int compare(String o1, String o2) {
//                 return o1.length() - o2.length();
//             }
//         };

         // 方法的返回值类型是一个函数式接口，所以我们可以返回lambda表达式
         return (o1,o2) -> o1.length() - o2.length();
     }

    @Test
    public void testGetComparator() {
        // 创建一个字符串数组
        String[] str = {"aaa","b","cccccc","dddddddddd"};
        // 输出排序前的数据
        System.out.println(Arrays.toString(str));
        // 调用方法把数组进行排序
        Arrays.sort(str, this.getComparator());
        System.out.println(Arrays.toString(str));
    }

}
