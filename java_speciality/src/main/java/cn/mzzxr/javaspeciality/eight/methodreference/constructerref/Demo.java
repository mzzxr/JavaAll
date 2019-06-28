package cn.mzzxr.javaspeciality.eight.methodreference.constructerref;

import cn.mzzxr.javaspeciality.eight.methodreference.function.PersonBuilder;
import cn.mzzxr.javaspeciality.eight.methodreference.po.Person;
import org.junit.Test;

import java.time.Period;

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
