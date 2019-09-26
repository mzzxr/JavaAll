package cn.mzzxr.javaall.designmode.singleton;

import cn.mzzxr.javaall.designmode.singleton.po.EnumWolf;
import cn.mzzxr.javaall.designmode.singleton.po.LazyWolf;
import org.junit.Test;

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
    public void testEnumWolf() {
        EnumWolf wolf = EnumWolf.WOLF;
        System.out.println(wolf);
    }

}
