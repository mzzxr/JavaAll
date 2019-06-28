package cn.mzzxr.javaspeciality.eight.streams;

import cn.mzzxr.javaspeciality.eight.streams.po.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description Stream流的练习
 * @Author LG
 * @Date 2019/6/27 23:39
 **/
public class BootStreamOfPractice {

    /**
     * Stream流的练习
     */
    @Test
    public void testPractice() {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream<Person> personStream = Stream.concat(oneStream, twoStream).map(name -> new Person(name));
        personStream.forEach(p-> System.out.println(p));

    }
}
