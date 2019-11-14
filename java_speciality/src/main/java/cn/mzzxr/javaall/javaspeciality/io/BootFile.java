package cn.mzzxr.javaall.javaspeciality.io;

import java.io.File;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/11/14
 **/
public class BootFile {

    public static void main(String[] args) {
        File file = new File("cn/mzzxr/javaall/javaspeciality/io/123.txt");
        System.out.println(file.isDirectory());
    }

}
