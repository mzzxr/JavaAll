package cn.mzzxr.javaspeciality.eight.lambda;

/**
 * @Description Supplier函数式接口
 * @Author LG
 * @Date 2019/6/21 13:35
 **/

import org.junit.Test;

import java.util.function.Supplier;

/**
 * 常用的函数接口
 * java.util.function.Supplier<T>接口仅包含一个无参的方法：T get(), 用来获取一个泛型参数指定类型的对象数据
 * <p>
 * Supplier<T>接口被称之为生产型接口, 指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 */
public class BootSupplier {
    // 定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String,get方法就会返回一个String
    public String getString(Supplier<String> sup) {
        return sup.get();
    }

    @Test
    public void testGetString() {
//        getString(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "hello";
//            }
//        });

        System.out.println(getString(() -> "hello"));
    }

    @Test
    public void testGetMax() {
        int arr[] = {2, 3, 4, 52, 333, 23};
        Integer arr_max = getMax(() -> {
            int max = arr[0];

            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(arr_max);
    }

    public Integer getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }


}
