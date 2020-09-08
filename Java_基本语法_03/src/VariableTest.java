/**
 * @Author: Jeffrey
 * @Description:
 * @Date: create in 2020/9/8 下午5:24
 * @Version：JDK1.8
 */

public class VariableTest {
    public static void main(String[] args) {
        // 变量的定义
        int myAge = 0;
        // 变量的使用
        System.out.println(myAge);

        // 先声明
        int myNumber;
        myNumber = 101;
        // 后赋值
        System.out.println(myNumber);

        // 无法直接其使用其他方法中的变量
        // System.out.println(myClass);
    }

    public void method(){
        // 这里的 myClass 变量只能在 method() 这个方法中使用
        int myClass = 1;
    }
}



/*
使用之前未被定义过
class TestForOne{
    public static void main(String[] args) {
        System.out.println(myNumber);
        int myNumber = 101;
    }
}
*/


/*
使用之间没有被赋值过（申明了，但并没有赋值）
class TestForTwo{
    public static void main(String[] args) {
        int myNumber;
        System.out.println(myNumber);
    }
}
*/


/*
同一个作用域内，不可以使用相同的变量名称定义变量
class TestForThree{
    public static void main(String[] args) {
        int number = 5;
        long number = 5;
    }
}
*/

