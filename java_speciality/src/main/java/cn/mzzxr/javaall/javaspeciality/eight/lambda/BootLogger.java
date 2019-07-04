package cn.mzzxr.javaall.javaspeciality.eight.lambda;

import cn.mzzxr.javaall.javaspeciality.eight.lambda.FunctionalInterface.MessageBuilder;
import org.junit.Test;

/**
 * @Description 日志案例
 * @Author LG
 * @Date 2019/6/20 13:01
 **/
public class BootLogger {
    // 定义一个根据日志的级别，显示日志信息的方法
    public void showLog(int level, String message) {
        // 对日志的等级进行判断，如果是1级别，那么输出日志信息
        if (level == 1) {
            System.out.println(message);
        }
    }

    @Test
    public void testShowLog() {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法，传递日志级别和日志信息
        /* 发现以下代码存在一些性能浪费的问题
         * 调用showLog方法，传递的第二个参数是一个拼接后的字符串
         * 先把字符串拼接好，然后调用showLog方法
         * 如果showLog方法中传递的日志等级不是1级
         * 那么就不会是如此拼接后的字符串
         * 所以感觉字符串就白拼接了
         *
         * */
        showLog(1, msg1 + msg2 + msg3);
    }




    /*
        使用lambda优化日志案例
        lambda的特点-延迟加载
        lambda的使用前提，必须存在函数式接口
     */
    public void showLogLambda(int level, MessageBuilder messageBuilder) {
        // 对日志的等级进行判断，如果是1级别，那么调用messageBuilder中的builderMessage
        if (level == 1) {
            System.out.println(messageBuilder.builderMessage());
        }
    }

    @Test
    public void testShowLogLambda() {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLogLambda方法, MessageBuilder是函数式接口，所以可以使用lambda表达式
        showLogLambda(1, () -> msg1 + msg2 + msg3);


        /**
         * 使用lambda表达式作为参数进行传递，仅仅是把参数传递到showLogLambda方法中
         * 只有满足条件，日志的等级是1级
         *      才会调用接口MessageBuilder中的方法builderMessage
         *      才会进行字符串的拼接
         * 如果条件不满足，日志的等级不是1级
         *       那么builderMessge方法也不会执行
         *       所以拼接字符串的代码也不会执行
         * 所以不会存在性能的浪费
         */
        showLogLambda(1, () -> {
            System.out.println("不满足条件不执行");
            return msg1 + msg2 + msg3;
        });

    }


}
