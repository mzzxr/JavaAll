package cn.mzzxr.javaall.javaspeciality.methodreference.superref;

import cn.mzzxr.javaall.javaspeciality.methodreference.function.Greetable;
import org.junit.Test;

/**
 * @Description 定义子类
 * @Author LG
 * @Date 2019/6/28 10:36
 **/
public class Man extends Human {
    // 重写父类sayHello的方法

    @Override
    public void sayHello() {
        System.out.println("hello,man");
    }

    public void method(Greetable greetable) {
        greetable.greet();
    }

    @Test
    public void show() {
        method(()->{
            Human h = new Human();
            h.sayHello();
        });
        method(this::sayHello);
    }

}
