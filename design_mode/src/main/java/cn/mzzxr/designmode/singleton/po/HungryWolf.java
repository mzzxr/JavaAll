package cn.mzzxr.designmode.singleton.po;

import java.util.function.Supplier;

/**
 * @Description 单例模式-饿狼
 * @Author LG
 * @Date 2019/6/24 12:26
 **/
public class HungryWolf {

    private String name;

    private static HungryWolf wolf = new HungryWolf();

    private HungryWolf() {}

    public static HungryWolf getHungryWolf() {
        return wolf;
    }

    public void say(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
