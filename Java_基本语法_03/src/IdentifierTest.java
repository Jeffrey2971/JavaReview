/**
 * @Author: Jeffrey
 * @Description:
 * @Date: create in 2020/9/7 下午11:11
 * @Version：JDK1.8
 */


/**
 * 标识符的使用
 * 1、标识符：凡是自己可以起名字的地方都可以被叫做标识符
 *      例如：类名、变量名、方法名、接口名、包名等等
 *
 * 2、标识符的命名规则
 *      由 26 个英文字母大小写，阿拉伯数字 0 - 9，_ 或 $ 组成
 *      数字不可以作为开头
 *      不可以使用关键字和保留字，但能包含关键字和保留字
 *      Java 中严格区分大小写，长度无限制
 *      标识符不能包含空格
 *
 * 3、Java 中的名称命名规范
 *      包名：多单词组成时所有字母都小写（xxxyyyzzz）
 *      类名、接口名：多单词组成时，所有单词的首字母大写（XxxYyyZzz）
 *      变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首写字母大写（xxxYyyZzz）
 *      常量名：所有字母都大写，多单词时每个单词用下划线链接（XXX_YYY_ZZZ）
 *      注意事项
 *          1、在起名字时，为了提高代码可读性应尽量有意义，起到“见名知意”的作用
 *          2、Java 采用 Unicode 字符集，因此标识符可以可用汉子声明，但不建议使用
 */
class IdentifierTest {
    public static void main(String[] args) {
        System.out.println("");
    }
}

class hello1_${

}

// 不会报错，因为关键字都为小写
class Static{

}

// 会报错，因为标识符使用了关键字
/*
class static{
}*
/

会报错，因为标识符不能以数字开头
/*
class 1Hello{
}
*/

// 会报错，因为标识符不能含有空格
/*
class H ello{
}
*/

// 变量命名规范
class TestOne{
    public static void main(String[] args){
        int myStudentCode = 1001;
        String myFavoriteFoot = "dumplings、noodle、shrimp";

        System.out.println(myStudentCode);
        System.out.println(myFavoriteFoot);
    }
}

// 常量命名规范
class TestTwo{
    public static void main(String[] args) {
        String PREFIX_MAX_NUMBER = "10000";
        System.out.println("最大的数字：" + PREFIX_MAX_NUMBER);
    }
}

// 由于 Java 使用的是 unicode 字符集编码，所以标识符可以取中文名
class 你好{
    public static void main(String[] args) {
        int 学号 = 1002;
        System.out.println("你好，世界！");
        System.out.println(学号);
    }
}

