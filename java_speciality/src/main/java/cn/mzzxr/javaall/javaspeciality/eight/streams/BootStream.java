package cn.mzzxr.javaall.javaspeciality.eight.streams;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description java.util.stream流操作
 * @Author LG
 * @Date 2019/6/19 11:47
 **/
public class BootStream {

    /**
     * 获取Stream的两种方法
     */
    @Test
    public void testStream() {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        // 获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        // 获取值，存储到一个Collection集合中赵六
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        // 获取键值对（键与值得映射关系， entrySet）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        // 数组转换为Stream流
        Vector<String> vector = new Vector();
        Stream<String> stream5 = vector.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Integer[] arr = {1,2,3,4};
        Stream<Integer> stream6 = Stream.of(arr);
    }

    /**
     * Stream流的foreach方法
     */
    @Test
    public void testForeach() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name -> System.out.println(name));
    }

    /**
     * Stream流的filter的方法
     */
    @Test
    public void testFilter() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.filter((str)->str.startsWith("张")).forEach(name-> System.out.println(name));
        // Stream流只能被使用一次
//        stream.forEach(name);
    }

    @Test
    public void testMap() {
        Stream<String> stream = Stream.of("1","2","3","4");
        Stream<Integer> integerStream = stream.map(str -> Integer.parseInt(str));
        integerStream.forEach(i-> System.out.println(i));
    }

    @Test
    public void testCount() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }

    @Test
    public void testlimit() {
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach(name-> System.out.println(name));
    }

    @Test
    public void testSkip() {
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));
    }

    @Test
    public void testConcat() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> stream1 = Stream.of("美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.println(name));
    }

}