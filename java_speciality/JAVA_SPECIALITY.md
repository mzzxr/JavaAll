# java常用特性
### java5特性
### java7特性
### java8特性
#### 1.函数式编程使用lambda表达式
使用java8自带的常用函数式接口
java.util.function包下:

    java.util.function.Supplier 生产者接口 
        无参数，可返回需要的类型数据
        
    java.util.function.Consumer 消费者接口
        需要任意参数进行自定义操作，无返回值
        
    java.util.function.Predicate 判断接口
        有任意类型参数，有返回值为boolean类型，可对参数进行最定义判断
        
    java.util.function.Function 转换接口
        有参数，有返回值，参数任意，返回值任意，从一种数据转换成另一种数据
        
java.lang包下：

    java.lang.Runnable 线程接口
        无参数，无输出，方法体可自定义任意逻辑
        
java.util包下：

    java.util.Comparator 比大小接口
        需要两个同类型参数，返回值为int

总结：函数式编程与lambda表达式的结合，类似员匿名内部类。

#### 2.Stream流的使用
两种获取方式
Stream.of();
Collection.stream();
