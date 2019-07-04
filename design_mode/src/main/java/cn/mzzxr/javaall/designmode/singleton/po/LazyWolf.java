package cn.mzzxr.javaall.designmode.singleton.po;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @Description 单例模式-懒狼
 * @Author LG
 * @Date 2019/6/24 12:54
 **/

/**
 * 延时加载
 */
public class LazyWolf {

    private String name;

    private static LazyWolf wolf = null;

    private LazyWolf() {}

    public static LazyWolf getLazyWolf() {
        if(Objects.isNull(wolf)) {
            wolf = new LazyWolf();
        }
        return wolf;
    }

    public void say(String cry, Consumer<String> consumer) {
        consumer.accept(cry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
