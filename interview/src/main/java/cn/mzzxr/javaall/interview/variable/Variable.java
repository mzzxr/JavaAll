package cn.mzzxr.javaall.interview.variable;

/**
 * @Description
 * @Author LG
 * @Date 2019/8/23 21:52
 **/
public class Variable {

    static int s;
    int i;
    int j;

    {
        int i = 1;
        i++;
        j++;
        s++;
    }

    public void test(int j) {
        j ++;
        i ++;
        s ++;
    }

    public static void main(String[] args) {
        Variable obj1 = new Variable(); // 局部变量
        Variable obj2 = new Variable();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);
    }

}
