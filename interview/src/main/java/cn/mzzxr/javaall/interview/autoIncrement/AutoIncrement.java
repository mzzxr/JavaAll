package cn.mzzxr.javaall.interview.autoIncrement;

import org.junit.Test;

/**
 * @Description 自增面试题
 * @Author LG
 * @Date 2019/7/1 21:37
 **/
public class AutoIncrement {

    @Test
    public void autoIncrement() {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
