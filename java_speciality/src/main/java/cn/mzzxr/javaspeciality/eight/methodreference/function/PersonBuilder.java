package cn.mzzxr.javaspeciality.eight.methodreference.function;

import cn.mzzxr.javaspeciality.eight.methodreference.po.Person;

/**
 * @Description 定义一个创建Person对象的函数式接口
 * @Author LG
 * @Date 2019/6/28 10:58
 **/
@FunctionalInterface
public interface PersonBuilder {

    Person builderPerson(String name);
}
