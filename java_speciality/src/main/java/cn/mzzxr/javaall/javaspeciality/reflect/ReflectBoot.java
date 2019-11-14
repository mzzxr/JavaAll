package cn.mzzxr.javaall.javaspeciality.reflect;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

public class ReflectBoot {

    public static void main(String[] args) {
//        Random generator = new Random();
//        Class cl = generator.getClass();
//        String clname = cl.getName();
//        System.out.println(clname);
//
//        String className = "java.util.Random";
//        try {
//            Class<Random> random = (Class<Random>) Class.forName(className);
//            Random random1 = random.newInstance();
//            System.out.println(random1.nextInt(1000));
//
//            for (Field field : random.getDeclaredFields()) {
//                Class<?> type = field.getType();
//                System.out.println(type.getName());
//            }
//
//        } catch (ClassNotFoundException e) {
//            System.out.println(className + " not find ");
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }


        String name;
        if (args.length>0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class<?> cl = Class.forName(name);
            Class<?> supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println("class " + name);
            if (supercl != null && supercl != Object.class) {
                System.out.println(" extens " + supercl.getName());
            }

            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printFields(Class<?> cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> type = field.getType();

            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");

        }
    }

    public static void printMethods(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("   ");
            Class<?> returnType = method.getReturnType();
            String name = method.getName();

            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print(returnType.getName() + " " + name + "(");

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    public static void printConstructors(Class<?> cl) {
        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            String name = c.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            
            // print parameter types
            Parameter[] parameters = c.getParameters();
            Class<?>[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName()+ " " + parameters[i].getName());
            }
            System.out.println(");");
        }
    }

    @Test
    public void test() {
        String[] a = new String[100];
        a[1] = "xxx";
        a = Arrays.copyOf(a, 2 * a.length);
        System.out.println(a.length);
        System.out.println(a[1]);
    }

}
