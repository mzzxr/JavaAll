package cn.mzzxr.javaall.javaspeciality.methodreference.constructerref;

import cn.mzzxr.javaall.javaspeciality.methodreference.po.Person;
import cn.mzzxr.javaall.javaspeciality.methodreference.function.PersonBuilder;
import org.junit.Test;

/**
 * @Description 类的构造器引用
 * @Author LG
 * @Date 2019/6/28 10:59
 **/
public class Demo {
    // 定义一个方法，参数传递一个姓名和PersonBuilder接口
    public void printNmae(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    @Test
    public void testPrintName() {
        printNmae("xx", name -> new Person(name));
        printNmae("xx", Person::new);
    }
}
