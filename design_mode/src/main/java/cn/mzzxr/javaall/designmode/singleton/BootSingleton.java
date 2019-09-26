package cn.mzzxr.javaall.designmode.singleton;

import cn.mzzxr.javaall.designmode.singleton.po.EnumWolf;
import org.junit.Test;

import cn.mzzxr.javaall.designmode.singleton.po.*;

/**
 * @Description 单例模式练习
 * @Author LG
 * @Date 2019/7/20 23:41
 **/
public class BootSingleton {


    @Test
    public void testLazyWolf() {
        LazyWolf wolf = LazyWolf.getWolf();
        LazyWolf wolf1 = LazyWolf.getWolf();
        System.out.println(wolf.hashCode());
        System.out.println(wolf1.hashCode());
    }

    @Test
    public void testHungryWolf() {
        HungryWolf wolf = HungryWolf.INSTANCE;
        System.out.println(wolf);
    }

    @Test
    public void testEnumWolf() {
        EnumWolf wolf = EnumWolf.WOLF;
        System.out.println(wolf);
    }

    @Test
    public void testStaticWolf() {
        StaticWolf wolf = StaticWolf.INSTANCE;
        System.out.println(wolf);
    }
}
