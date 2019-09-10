package cn.mzzxr.javaall.interview.recursion;

import org.junit.Test;

/**
 * @Description
 * @Author LG
 * @Date 2019/8/23 21:11
 **/
public class StepTest {

    // 递归实现f(n):求 n 步台阶，一共有几种走法
    public int f(int n) {
        if(n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n == 1 || n ==2) {
            return n;
        }
        return f(n-2) + f(n-1);
    }

    // 循环迭代，速度更快
    public int loop(int n) {
        if(n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n == 1 || n ==2) {
            return n;
        }
        int one = 2; // 初始化为走到第二级台阶的走法
        int two = 1; // 初始化为走到第一级台阶的走法
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }

        return sum;

    }

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        System.out.println(loop(45));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
