package cn.mzzxr.javaall.designmode.singleton;

import cn.mzzxr.javaall.designmode.singleton.po.*;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @Description 单例模式练习
 * @Author LG
 * @Date 2019/7/20 23:41
 **/
public class BootSingleton {

    @Test
    public void testHungryWolf() {
        HungryWolf wolf = HungryWolf.INSTANCE;
        System.out.println(wolf);
    }

    @Test
    public void testEnumWolf() {
        EnumWolf wolf = EnumWolf.INSTANCE;
        System.out.println(wolf);
    }

    @Test
    public void testStaticWolf() {
        StaticWolf wolf = StaticWolf.INSTANCE;
        System.out.println(wolf);
    }

    @Test
    public void testLazyPig() throws ExecutionException, InterruptedException {
//        LazyPig lazyPig1 = LazyPig.getLazyPig();
//        LazyPig lazyPig2 = LazyPig.getLazyPig();
//        System.out.println(lazyPig1 == lazyPig2);
//        System.out.println(lazyPig1);
//        System.out.println(lazyPig2);

        Callable<LazyPig> c = new Callable<LazyPig>() {
            @Override
            public LazyPig call() throws Exception {
                return LazyPig.getLazyPig();
            }
        };

        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<LazyPig> f1 = executorService.submit(c);
        Future<LazyPig> f2 = executorService.submit(c);
        LazyPig lazyPig1 = f1.get();
        LazyPig lazyPig2 = f2.get();
        long end = System.currentTimeMillis();

        System.out.println(end-start);

        System.out.println(lazyPig1 == lazyPig2);
        System.out.println(lazyPig1);
        System.out.println(lazyPig2);

        executorService.shutdown();
    }

    @Test
    public void testInnerPig() {
        InnerPig instance = InnerPig.getInstance();
        System.out.println(instance);
    }

}
