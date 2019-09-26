package cn.mzzxr.javaall.designmode.singleton.po;

import com.sun.imageio.plugins.common.LZWCompressor;

/**
 * @Description 懒汉式
 * @Author LG
 * @Date 2019/7/20 23:47
 **/
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

    @Override
    public String toString() {
        return super.toString();
    }
}
