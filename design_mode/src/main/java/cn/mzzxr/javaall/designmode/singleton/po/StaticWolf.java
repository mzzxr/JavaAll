package cn.mzzxr.javaall.designmode.singleton.po;

import java.io.IOException;
import java.util.Properties;

/**
 * @Description
 * @Author LG
 * @Date 2019/8/16 21:16
 **/
public class StaticWolf {
    /**
     * 静态代码块是为了,可以动态的去加载单例
     */

    public static final StaticWolf INSTANCE;

    private String info;

    static {
        try {
            Properties properties = new Properties();
            properties.load(StaticWolf.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new StaticWolf(properties.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private StaticWolf(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "StaticWolf{" +
                "info='" + info + '\'' +
                '}';
    }
}
