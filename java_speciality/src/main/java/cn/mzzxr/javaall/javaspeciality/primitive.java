package cn.mzzxr.javaall.javaspeciality;

public class primitive {

    public static void main(String[] args) {
        byte aByte = -128;  // -128 - 127

        short aShort = -32768; // -32768 ~ 32767

        int aInt = -2147483648; // -2147483648 ~ 2147483647

        long aLong = -9223372036854775808L; // -9223372036854775808  ~ 9223372036854775807

        float aFloat = 66666666666666f;

        double aDouble = 6666666666666666666d;

        char aChar = '\u0008';
        char bChar = 'A';
        char cChar = 97;
        System.out.println(aChar);
        System.out.println(bChar);
        System.out.println(cChar);
    }
}