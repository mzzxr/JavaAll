package cn.mzzxr.javaall.designmode.singleton.po;

/**
 * @Description
 * @Author LG
 * @Date 2019/8/22 22:22
 **/
public class InnerPig {

    /**
     * 利用了内部类不会自动随着外部类的加载而加载，它是要单独去加载和初始化的
     * 当调用时会去加载初始化，因此保持了懒加载
     * 且加载的实例final标识,是线程安全的
     */

    private InnerPig() {

    }

    private static class Inner{
        private static final InnerPig INSTANCE = new InnerPig();
    }

    public static InnerPig getInstance() {
        return Inner.INSTANCE;
    }

}
