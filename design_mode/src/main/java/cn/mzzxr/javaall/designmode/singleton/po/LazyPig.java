package cn.mzzxr.javaall.designmode.singleton.po;

/**
 * @Description 懒汉式
 * @Author LG
 * @Date 2019/7/20 23:47
 **/
public class LazyPig {

    /**
     * (1) 构造器私有化
     * (2) 用一个静态变量保存这个唯一的实例
     * (3) 提供一个静态方法，获取这个实例对象
     */

    private static LazyPig instance;

    private LazyPig() {

    }

    // 存在线程安全问题
//    public static LazyPig getLazyPig() {
//        if (instance == null) {
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            instance = new LazyPig();
//        }
//        return instance;
//    }

    // 用同步的方法解决线程不安全问题
//    public static LazyPig getLazyPig() {
//        synchronized (LazyPig.class) {
//            if (instance == null) {
//                instance = new LazyPig();
//            }
//        }
//        return instance;
//    }


    // 提高线程安全的速度问题
    public static LazyPig getLazyPig() {
        if (instance == null) {
            synchronized (LazyPig.class) {
                if (instance == null) {
                    instance = new LazyPig();
                }
            }
        }
        return instance;
    }



}
