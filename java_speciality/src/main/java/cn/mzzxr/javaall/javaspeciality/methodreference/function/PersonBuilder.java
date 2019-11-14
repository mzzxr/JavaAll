package cn.mzzxr.javaall.javaspeciality.methodreference.function;

import cn.mzzxr.javaall.javaspeciality.methodreference.po.Person;

/**
 * @Description 定义一个创建Person对象的函数式接口
 * @Author LG
 * @Date 2019/6/28 10:58
 **/
@FunctionalInterface
public interface PersonBuilder {

    Person builderPerson(String name);
}
