package cn.mzzxr.javaall.javaspeciality.eight.streams.po;

/**
 * @Description TODO
 * @Author LG
 * @Date 2019/6/27 23:29
 **/
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
