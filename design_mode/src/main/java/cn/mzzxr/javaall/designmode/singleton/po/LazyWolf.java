package cn.mzzxr.javaall.designmode.singleton.po;

public class LazyWolf {

    private static LazyWolf wolf = null;

    private LazyWolf() {

    }

    public static LazyWolf getWolf() {
        if (wolf == null) {
            wolf = new LazyWolf();
        }
        return wolf;
    }

}
