/**
 * @Author: Jeffrey
 * @Description:
 * @Date: create in 2020/9/8 下午7:57
 * @Version：JDK1.8
 */

/**
 * 1、变量的分类，按数据类型
 * 对于每一种数据都定义了明确的具体数据类型（强类型语言），在内存中分配了不同大小的空间
 *
 * 基本数据类型
 *   整形：byte（ 1 字节 = 8 Bit ） \ short（ 2 字节 ） \ int （ 4 字节 ）\ long （8 字节）
 *   浮点型：float \ double
 *   字符型：char
 *   布尔型：boolean
 * 通常定义整形变量时，使用 int 型即可
 *
 * 引用数据类型
 *   类：class
 *   接口：interface
 *   数组：array
 */
public class DataType {
    public static void main(String[] args) {
        methodByte();
        methodShort();
        methodInt();
        methodLong();
    }

    /**
     * byte 范围：-128^2-1（128 ～ 127）
     */
    public static void methodByte(){
        byte b1 = 12;
        byte b2 = -128;
        b2 = 127;

        // b2 = 128; 编译不通过，byte 类型最大范围只能到 127
        System.out.println(b1);
        System.out.println(b2);
    }

    /**
     * short 范围：-2^15 ~ 2^15-1 （-32768 ～ 32767）
     */
    public static void methodShort(){
        short s1 = -32768;
        short s2 = 32767;
        // s1 = 32768; 编译不通过，short 最大范围只能到 32767
        System.out.println(s1);
        System.out.println(s2);
    }

    /**
     * int 范围：-2^32 ~ 2^31-1（-2147483648 ～ 2147483647）
     */
    public static void methodInt(){
       int i1 = -2147483648;
       int i2 = 2147483647;
       // i2 = 2147483648; 编译不通过，int 类型最大只能到 2147483647
        System.out.println(i1);
        System.out.println(i2);
    }

    /**
     * long 类型范围：-2^63 ~ 2^63-1（-9223372036854775808 ～ 9223372036854775807）,声明 long 型数据类型时需要在尾部添加 l 或 L
     */
    public static void methodLong(){
        long l1 = -9223372036854775808L;
        long l2 = 9223372036854775807L;
        // l2 = 9223372036854775808L; 编译不通过，long 类型最大只能到 9223372036854775807L
        System.out.println(l1);
        System.out.println(l2);

    }


}

