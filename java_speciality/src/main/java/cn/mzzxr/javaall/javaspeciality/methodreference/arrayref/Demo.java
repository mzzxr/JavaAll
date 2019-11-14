package cn.mzzxr.javaall.javaspeciality.methodreference.arrayref;

import cn.mzzxr.javaall.javaspeciality.methodreference.function.ArrayBuilder;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Description 方法引用创建数组
 * @Author LG
 * @Date 2019/6/28 11:09
 **/
public class Demo {

    public int[] createArray(int len, ArrayBuilder ab) {
        return ab.builderArray(len);
    }

    @Test
    public void testCreateArray() {
        int[] array = createArray(10, len -> new int[len]);
        System.out.println(array.length);
        /*
            方法引用创建数组
         */
        int[] array1 = createArray(11, int[]::new);
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);
    }

}
