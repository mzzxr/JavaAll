package cn.mzzxr.javaall.javaspeciality.lambda;

/**
 * @Description lambda与runnable
 * @Author LG
 * @Date 2019/6/20 13:34
 **/

import org.junit.Test;

/**
 * 例如java.lang.Runnable接口是一个函数式接口
 * 假设有一个startThread方法使用该接口作为参数，那么就可以使用lambda进行传参
 * 这种情况其实和Thread类的构造方法参数为Runnable没有什么区别
 */
public class BootRunnable {
    // 定义一个方法startThread, 方法的参数使用函数式接口Runnable
    public void startThread(Runnable run) {
        new Thread(run).start();
    }

    @Test
    public void testStartThread() {
        // 调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程已启动");
            }
        });

        // 调用startThread方法，方法的参数是一个函数式接口，那么我们可以传递lambda表达式
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + "线程已启动");
        });


        // 优化lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "-->" + "线程已启动"));
    }


}
