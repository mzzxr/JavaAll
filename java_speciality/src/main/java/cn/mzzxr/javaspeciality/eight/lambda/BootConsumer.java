package cn.mzzxr.javaspeciality.eight.lambda;

/**
 * @Description Consumer是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么
 * @Author LG
 * @Date 2019/6/23 22:18
 **/

import org.junit.Test;

import java.util.function.Consumer;

/**
 * java.util.function.Consumer<T>接口刚正好与Supplier接口相反，
 * 它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定
 * Consumer接口中包含抽象方法void accept(T t), 意为消费一个指定类型的数据
 */
public class BootConsumer {

    /**
     * 定义一个方法
     * 方法的参数传递一个字符串的姓名
     * 方法的参数传递Consumer接口，泛型使用String
     * 可以使用Consumer接口消费字符串的类型
     */
    public void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    @Test
    public void testMethod() {

        method("baobao", (String name) -> {
            System.out.println(name);
            StringBuffer reName = new StringBuffer(name).reverse();
            System.out.println(reName);
        });
    }

    /**
     * Consumer的andThen方法可以拼接两个Consumer去消费，消费两次
     * 例如:
     * Consumer<String> con1
     * Consumer<String> con2
     * String = "hello"
     * con1.accept(s);
     * con2.accept(s);
     * 连接两个Consumer接口，再进行消费
     * con1.andThen(con2).accept(s);谁写前边谁先消费
     */
    public void methodAndThen(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);
    }

    @Test
    public void testAndThen() {
        methodAndThen("lili",
                (s) -> System.out.println(s + " ai niuniu"),
                (s) -> System.out.println("niuniu ai " + s)
        );
    }

    // 练习题
    @Test
    public void testPrintInfo() {
        String[] array = {"路飞，男","旋涡鸣人，男","小牛，男"};
//        printInfo((str)->{
//            String name = str.split("，")[0];
//            System.out.print("姓名："+name+",");
//        },(str)->{
//            String sex = str.split("，")[1];
//            System.out.println("性别："+sex);
//        },array);

        printInfo((str)-> System.out.print("姓名："+str.split("，")[0]+","),
                (str)-> System.out.println("性别："+str.split("，")[1]),
                array);
    }

    public void printInfo(Consumer<String> one, Consumer<String> two,String[] array) {
        for (String s : array) {
            one.andThen(two).accept(s);
        }
    }



}
