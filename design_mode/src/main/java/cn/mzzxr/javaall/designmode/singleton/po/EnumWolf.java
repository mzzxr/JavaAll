package cn.mzzxr.javaall.designmode.singleton.po;

/**
 * @Description 单例模式-枚举狼
 * @Author LG
 * @Date 2019/6/24 15:30
 **/
public enum EnumWolf {

    /**
     * 实例狼
     */
    WOLF;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
