package cn.mzzxr.designmode.singleton;

import cn.mzzxr.designmode.singleton.po.EnumWolf;
import cn.mzzxr.designmode.singleton.po.HungryWolf;
import cn.mzzxr.designmode.singleton.po.LazyWolf;
import org.junit.Test;

/**
 * @Description 单例模式练习
 * @Author LG
 * @Date 2019/6/24 10:58
 **/
public class BootSingleton {

    @Test
    public void testHungryWolf() {
        HungryWolf wolf = HungryWolf.getHungryWolf();
        wolf.say(() -> "(｀Д´) 吼~(ノ｀Д)ノ");
    }

    @Test
    public void testLazyWolf() {
        LazyWolf wolf = LazyWolf.getLazyWolf();
        wolf.say("_:('Θ' 」 ∠):_", (cry) -> {
            System.out.println(cry+"呜~");
        });
    }

    @Test
    public void testEnumWolf() {

        LazyWolf wolf = LazyWolf.getLazyWolf();



    }

}
