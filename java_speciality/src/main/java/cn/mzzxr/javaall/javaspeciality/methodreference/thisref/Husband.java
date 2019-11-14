package cn.mzzxr.javaall.javaspeciality.methodreference.thisref;

import cn.mzzxr.javaall.javaspeciality.methodreference.function.Richable;
import org.junit.Test;

/**
 * @Description 通过this引用本类成员方法
 * @Author LG
 * @Date 2019/6/28 10:51
 **/
public class Husband {
    public void buyHouse() {
        System.out.println("在北京二环内买一套四合院！");
    }
    public void marry(Richable richable) {
        richable.buy();
    }

    @Test
    public void soHappy() {
        marry(this::buyHouse);
    }
}
