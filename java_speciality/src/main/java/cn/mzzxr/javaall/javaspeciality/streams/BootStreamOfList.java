package cn.mzzxr.javaall.javaspeciality.streams;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/6/27 15:11
 **/
public class BootStreamOfList {

    @Test
    public void testStreamList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("百里守约");
        list.add("安琪拉");
        list.add("鲁班");

        list.stream().filter(name -> name.length() > 3)
                .filter(name -> name.startsWith("百"))
                .forEach(name -> System.out.println(name));
    }
}