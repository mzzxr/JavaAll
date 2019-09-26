package cn.mzzxr.javaall.designmode.singleton.po;

/**
 * @Description 饿汉式
 * @Author LG
 * @Date 2019/7/20 23:43
 **/
public class HungryWolf {
    /**
     * 饿汉式：在类初始化时直接创建实例对象，不管你是否需要这个对象
     *
     * (1) 构造器私有化
     * (2) 自行创建，并且静态变量保存
     * (3) 向外提供这个实例
     * (4) 强调这是一个单例，我们可以用final修改
     */
    public static final HungryWolf INSTANCE = new HungryWolf();

    private HungryWolf() {
    }
}
