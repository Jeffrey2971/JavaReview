# Java Note

## 一、Java 入门

### 1、软件开发介绍

- 软件开发

  软件，及一些列按照特定顺序组织的计算机数据和指令的集合，有系统软件和应用软件之分

- 人机交互方式
  - 图形化界面
    - 这种方式简单直观，使用者十分方便，容易上手操作
  - 命令行方式
    - 需要一个控制台，输入一些特定的命令，让计算及完成制定的操作。这种方式较为麻烦且需要记住一些命令
  
- JavaSE 基础图谱

  - ![1599484197200](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599484197200.png)

- 常用的DOS 命令
  - dir：列出当前目录下的文件
  - md：创建目录
  - rd：删除目录
  - cd：进入到制定目录
  - cd..：返回到上一层目录
  - cd\：返回到根目录
  - del：删除文件
  - exit：退出 DOS 命令行
  - 扩展
    - echo HelloWorld > test.txt ：将 HelloWorld 追加写入到 test.txt 文件中，如果文件不存在则创建并写入
    - echo HelloWorld >> test.txt：将 HelloWorld 覆盖写入到 test.txt 文件中，如果文件不存在则创建并写入

### 2、计算机编程语言介绍

#### 1、什么是计算机语言

- 语言：语言是人与人之间沟通的一种方式。例如：中国人与中国人之间使用普通话进行交流，而中国人与外国人交流就需要学习英语，或者外国人学习中文

- 计算机语言就是人与计算机之间“沟通交流”的语言。而计算机语言有多种。例如：C、C++、Java、PHP、Kotlin、Python、Scala 等等。
- 第一代语言，机器语言
  - 指令以二进制代码形式存在
- 第二代语言，汇编语言
  - 使用助记符表一条机器指令
  - ![1599216679243](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599216679243.png)
- 第三代语言，高级语言
  - C、Pascal、Fortran 面向过程的语言
  - C++  ，面向过程/面向对象
  - Java 夸平台的纯面向对象的语言
  - .NET 跨语言的平台
  - Python、Scala ...

#### 2、Why is Java

- ![1599556601940](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556601940.png)
- ![1599556639861](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556639861.png)

### 3、Java 语言概述

#### 1、语言概述

- JAVA 语言是 SUN 公司在 1995 年推出的一门高级编程语言
- JAVA 语言是一种面向 Internet 的编程语言，Java 一开始富有吸引力是因为 Java 程序可以在 Web 浏览器中运行。这些 Java 程序被称为 Java 小程序（applet），applet 使用现代的图形用户界面与 Web 用户进行交互。applet 内嵌在 HTML 代码中
- 随着 Java 技术在 Web 方面的不断成熟完善，已经成为 Web 应用的首选开发语言
- JAVA 语言历史
  -  1991年 Green项目,开发语言最初命名为Oak (橡树)
  - 1994年,开发组意识到Oak 非常适合于互联网
  - 1996年,发布JDK 1.0,约8.3万个网页应用Java技术来制作
  - 1997年,发布JDK 1.1,JavaOne会议召开,创当时全球同类会议规模之最
  - 1998年,发布JDK 1.2,同年发布企业平台J2EE
  - 1999年,Java分成J2SE、J2EE和J2ME,JSP/Servlet技术诞生
  - 2004年,发布里程碑式版本:JDK 1.5,为突出此版本的重要性,更名为JDK 5.0
  - 2005年,J2SE -> JavaSE,J2EE -> JavaEE,J2ME -> JavaME
  - 2009年,Oracle公司收购SUN,交易价格74亿美元
  - 2011年,发布JDK 7.0
  - 2014年,发布JDK 8.0,是继JDK 5.0以来变化最大的版本
  - 2017年,发布JDK 9.0,最大限度实现模块化
  - 2018年3月,发布JDK 10.0,版本号也称为18.3
  - 2018年9月,发布JDK 11.0,版本号也称为18.9

#### 2、Java 技术体系平台

- Java SE 标准版
  - 支持面向桌面级应用（例如 Windows 下的应用程序）的 Java 平台，提供了完善的 Java 核心 API，此版本以前称为 J2SE
- Java EE 企业版
  - 是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如：Servlet、JSP 等，主要针对 Web 应用程序的开发，此版本以前称为 J2EE
- Java ME 小型版
  - 支持 Java 程序运行在移动端（例如手机、pad）上的平台，对 JavaAPI 有所精简，并加入了针对移动端的终端支持，此版本之前称之为 J2ME
- Java Card
  - 支持一些 Java 小程序（Applets）运行在小内存设备上（例如智能卡等）上的平台

#### 3、Java 在各领域中的应用

- 企业级应用
  - 主要是指大型企业中复杂的软件系统，各种类型的网站。Java 的安全机制以及它的跨平台优势，使它在分布式系统领域开发中有着广泛的应用（包括金融领域、电信领域、交通领域、电子商务等领域）
- Android 平台应用
  - Android 应用程序使用 Java 语言编写。Android 开发水平的高低很大程度上取决于 Java 语言核心能力是否扎实
- 大数据平台开发
  - 各种框架有 Hadoop、spark、storm、flink 等，就这类技术生态圈来讲，还有各种中间件，例如flume、kafka、sqoop 等等，这些框架以及工具大多数是使用 Java 语言编写的，但提供诸如 Java、Scala、Python 、R 等各种语言 API 工编程。
- 移动领域应用
  - 主要表现在消费和嵌入式领域，是指在各种小型设备上使用，包括手机、机顶盒、PAD、汽车通信设备等

#### 4、Java 语言的诞生

- ![1599556675559](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556675559.png)

- 5、Java 语言的主要特性

  - Java 语言是易学的
    - Java 语言的语法与 C 语言和 C++ 语言接近，使得大多数程序员很容易学习和使用 Java
  - Java 语言是强制面向对象的
    - Java 语言提供类、接口和继承等原语，为了简单起见，支持持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字：implements）
  - Java 语言是分布式的
    - Java 语言支持 Internet 应用的开发，在基本的 Java 应用编写接口中有一个网络应用接口（java net），它提供了用于网络应用编程的类库，包括 URL、URLConnection、Socket、ServerSocket 等。Java 的 RMI（远程方法激活）机制也是开发分布式的重要手段
  - Java 语言是健壮的
    - Java 的强制类型机制、异常处理、垃圾自动回收等是 Java 程序健壮性的重要保证。对指针的丢弃是 Java 的明确选择
  - Java 语言是安全的
    - Java 通常被用在网络环境中，为此，Java 提供了一个安全机制以防止恶意代码的攻击。例如：安全防范机制（类 ClassLoader），如分配不同的名字空间以防止代替本地的同类名、字节代码检查
  - Java 语言是体系结构中立的
    - Java 程序（后缀名为 Java 的文件）在 Java 平台上被便以为体系结构中立的字节码格式（后缀名为 class 的文件），然后可以在实现这个 Java 平台的任何系统中运行
  - Java 语言是解释型的
    - Java 程序在 Java 平台上被编译为字节码格式，然后可以在实现这个 Java 平台的任何系统中的解释器中运行
  - Java 是性能略高的
    - 与其他解释型的高级脚本语言相比，Java 的性能还是算比较优越的
  - Java 语言是原生支持多线程的
    - 在 Java 语言中，线程是一种特殊的现象，它必须由 Thread 类或其子类来创建

### 4、运行机制及运行过程

#### 1、Java 语言的特点

- 特点一：面向对象
  - 两个基本的概念：类、对象
  - 三大特性：封装、继承、多态
- 特点二：健壮性
  - 吸收了 C/C++ 语言的特点，但去掉了影响程序健壮性的部分（例如指针、内存的申请与释放等），提供了一个相对安全的内存管理和访问机制
- 特点三：跨平台性
  - 跨平台性：通过 Java 语言编写的应用程序在不同的系统平台上都可以运行
  - 原理：只要在需要运行 Java 应用程序的操作系统上，先安装一个 Java 虚拟机即可，由 JVM 来负责 Java 程序在该系统中的运行
  - ![1599556714956](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556714956.png)
- Java 的两种核心机制
  - Java 虚拟机
    - ![1599556748743](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556748743.png)
    - ![1599556774462](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556774462.png)
  - 垃圾回收机制
    - 不再使用的内存空间应被回收：垃圾回收
      - 在 C/C++ 等语言中，有程序员负责回收无用的内存空间
      - Java 语言消除了程序员回收内存的责任，它提供一种系统线程跟踪存储空间的分配情况，并在 JVM 空闲时检查并释放那些可被释放的内存空间
    - 垃圾回收在 Java 程序运行过程中自动进行，程序员无法精确控制和干预
    - **即使这样，如果代码编写有 bug ，Java 程序还是有可能会出现内存泄露和内存溢出的问题**

### 5、Java 的环境搭建

#### 1、什么是 JDK，JRE，JVM

- JDK（Java 开发工具包）
  - JDK 是提供给 Java 开发人员使用的，其中包含了 Java 的开发工具，其中包括了 JRE。所以，只要安装了 JDK ，就不需要单独安装 JRE 了
  - 其中的开发工具：编译工具（javac.exe），打包工具（jar.exe）

- JRE（Java 运行环境）
  - 包括 Java 虚拟机和 Java 程序所需要的核心类库等，如果想要运行一个开发好的 Java 程序，计算机只需要安装 JRE 即可
- JVM（Java 虚拟机）
  - JVM 即 Java 虚拟机，它主要的功能就是将编译好的 class 文件进行解释执行，因为 class 文件不能由操作系统直接执行，所以需要 JVM 解释执行，这也是 Java 语言跨平台的重要组件
- 简单而言，使用 JDK 的开发工具完成 Java 程序后交给 JRE 运行
  - JDK = JRE + 开发工具集（例如 javac 编译工具等等）
  - JRE = JVM + JAVA SE 标准类库
  - ![1599556854971](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556854971.png)
- 官网解释
  - ![1599556817609](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556817609.png)

#### 2、下载并安装 JDK

- 官方网址
  - [下载地址1](http://orcale.com)
  - [下载地址2](https://java.sun.com)

- 安装 JDK

  - 注意事项：安装路径中为避免不必要的错误最好不要含有中文空格等特殊符号
  - 如果操作系统是 64 位的，软件最好选择 64位的，除非软件本身不区分
  - 当提示安装 JRE 时，正常在 JDK 安装时已经装过了，但是为了后续使用 IDE 开发工具时不报错，最好也按照提示安装 JRE

- 环境配置（Linux 系统中）

  - vim ./.bashrc

  - 粘入以下内容

    - ```shell
      # JDK for 8
      # export JAVA_HOME=/usr/local/jdk1.8.0_241
      # export JRE_HOME=${JAVA_HOME}/jre
      # export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
      # export PATH=${JAVA_HOME}/bin:$PATH
      
      # JDK for 9
      export JAVA_HOME=/usr/local/jdk-9
      export JRE_HOME=${JAVA_HOME}/jre
      export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
      export PATH=${JAVA_HOME}/bin:$PATH
      
      # JDK for 14
      # export JAVA_HOME=/usr/local/jdk14
      # export JRE_HOME=${JAVA_HOME}/jre
      # export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
      # export PATH=${JAVA_HOME}/bin:$PATH
      # export PATH="/usr/local/jdk-14/bin/:$PATH"
      ```

  - source ./.bashrc

### 6、HelloWorld

- 新建名为 helloWorld 的 java 文件并编写以下代码

  - ```java
    public class helloWorld{
    	public static void main(String[] args){
    	System.out.println("HelloWorld!");
    	}
    }
    ```

- 在命令行中，使用 jdk 工具包中的 javac 编译以上写好的 Java 文件

  - ```shell
    javac helloWorld.java
    ```

- 执行完以上命令之后会发现在文件夹下自动生成了 helloWorld.class 文件

  - ![1599556922757](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556922757.png)


### 7、注解（Comment）

- 单行注释：可以在任意一行代码上使用 // 表示单行注释，在 // 后的所有内容都不会被 JVM 所解释执行

  - 格式

    - ```java
      // 注释内容
      ```

  - 例子

    - ```java
      class helloWorld{
          public static void main(String[] args){
              System.out.print("Hello,World!");  // 我的第一个 Java 程序
          }
      }
      ```

- 多行注释：可以在任意一处地方使用 /** 注释内容 **/ 表示多行注释，在期间的所有内容都不会被 JVM 所解释执行

  - 格式
  
    - ```java
    /**
      	注释内容
      **/
      ```
    
  - 例子
  
  - ```java
    class helloWorld{
        public static void main(String[] args){
              System.out.print("Hello,");
              /**
              	我的第一个 Java 程序
              **/
              System.out.print("World!")
          }
      }
    ```

- 文档注释（Java 特有），注释的内容可以被 jdk 提供的工具 javadoc *所解析并生成一套以网页文件形式的改程序的说明文档*

  - 格式

    - ```java
      /**
      	@author 指定 Java 程序的作者
      	@version 制定源文件的版本
      	...
      **/
      ```

  - 例子

    - ```java
      /**
      	@author 指定 Java 程序的作者
      	@version 制定源文件的版本
      **/
      class helloWorld{
          public static void main(String[] args){
              System.out.print("Hello,World!")
          }
      }
      ```

### 8、Java API 文档

- API（应用程序编程入口），是 Java 提供的基本编程接口
- Java 语言提供了大量的基础类，因此 Oracle 也为了这些基础类提供了相对应的 API 文档，用于告诉开发者如何使用这些类，以及这些类里面包含的方法
- [Jdk API 文档下载地址](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- 页面分布
  - ![1599556977956](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599556977956.png)

### 9、HelloWorld 总结

- 1、Java 程序是一个编写 -> 编译 -> 运行的过程

  - 编写：将编写的 Java 代码保存在以 .java 结尾的源文件中
  - 编译：使用 jdk 中的开发工具 javac 来编译 java 的源文件从而生成以类名为名称的字节码文件，格式为： javac 原文件名.java
  - 运行：使用 jdk 中的开发工具 java.exe 来运行字节码文件，格式为： java 类名

- 2、在一个 Java 源文件中可以声明多个 class 类，但是最多只能有一个类被声明为 public 而且要求声明 public 的类名必须与原文件名相同，否则会在编译是报错

  - ```java
    public class HelloWorld{
        public static void main(String arguments[]){
            System.println("HelloWorld");
        }
        
        class Person{
            
        }
        
        class Animal{
            
        }
    }
    ```

  - 

- 3、程序的入口是 main() 方法，格式是固定的，其中变量名称（args）可以更改和和 String 后面的中括号可以更换到变量名称后的位置，其他参数都需要严格书写

  - ```java
    public static void main(String arguments[]){
        // ...
    }
    ```

- 4、较为常用的输出语句，println() 表示输出括号内的内容后换行，print() 表示不换行

  - System.out.println(); // 先输出数据，然后换行
  - System.out.print(); // 只输出数据

- 5、每一个执行语句的尾部都 " ; " 分号结束

- 6、编译的过程：在多个 class 类的情况下，编译时会生成一个或多个字节码文件，字节码文件的文件名与 java 原文件中的类名相同，生成几个取决于 java 原文件中有几个 class 类

### 10、良好的编程风格

- 正确的注释和注释风格

  - 使用文档注释来注释整个类或者整个方法
  - 如果注释方法中的某一个步骤可使用单行或多行注释

- 正确的缩进和空白

  - 按一下 tab 表示缩进
  - 运算符两边习惯性各加一个空格，例如 2 + 4 * 5

- 块的风格

  - Java API 源代码选择了行尾风格

  - 行尾风格

    - ```java
      public class Test {
          public static void main(String[] args) {
              System.out.println("HelloWorld!");
          }
      }
      ```

  - 次行风格

    - ```java
      public class Test
      {
          public static void main(String[] args)
          {
              System.out.println("HelloWorld!");
          }
      }
      ```

### 11、常用的 Java 开发工具

- 文档编辑工具
  - 记事本
  - Notepad ++
  - EditPlus
  - SublimeText
- IDE 工具
  - idea
  - eclipse
  - MyEclipse

### 12、练习

#### 1、JDK、JVM、JRE 三者之间的关系，以及 JDK、JRE 包含的主要结构有那些

- JDK：JDK = JRE + Java 的开发工具（javac、java、javadoc）
- JRE：JRE = JVM + JavaSE 核心类库

#### 2、为什么要配置 path 环境变量？如何配置？

- 因为需要在任何一个文件路径下都可以执行 java 的开发工具，所以需要配置 Java 的环境变量
- JAVA_HOME = bin 的上一层目录
- path = %JAVA_HOME%\bin

#### 3、常用的几个命令操作都有那些？（至少四个）

- cd：切换目录
- java
- javadoc
- md：创建目录
- rd：删除目录
- del：删除文件
- cd..：退回到上一层目录
- cd/：退回到盘符

#### 4、创建一个类，使得运行后可以得到以下输出

- ![1599470329892](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599470329892.png)

- 代码
  - ```java
    public class chairMan{
        public static void main(String args[]){
            System.out.println("姓名：习大大\n\n性别：男\n家庭住址：北京")
        }
    }
    ```

- 编译

  - ```shell
    javac chairMan.java
    java chariMan.class
    ```

##  二、变量与运算符

### 1、关键字和保留字

#### 关键字

- 关键字（keyword）的定义和特点

  - 定义：被 Java 语言赋予特殊的含义，用于做专门用途的字符串（单词）
  - 特点：关键字中所有的字母都是小写
  - [官方地址参考](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

- 用于定义数据类型的关键字

  - | class | interface | enum  | byte   | short |
    | ----- | --------- | ----- | ------ | ----- |
    | int   | long      | float | double | char  |
    | void  | boolean   |       |        |       |

- 用于定义流程控制的关键字

  - | if     | else | switch | case  | default  |
    | ------ | ---- | ------ | ----- | -------- |
    | while  | do   | for    | break | continue |
    | return |      |        |       |          |

- 用于定义访问权限修饰符的关键字

  - | private | protected | public |
    | ------- | --------- | ------ |
    |         |           |        |

- 用于定义类、函数、变量修饰符的关键字

  - | abstract | final | static | synchronized |
    | -------- | ----- | ------ | ------------ |
    |          |       |        |              |

- 用于定义类与类之间的关键字

  - | extends | implements |
    | ------- | ---------- |
    |         |            |

- 用于定义建立实例及应用实例，判断的关键字

  - | new  | this | super | instanceof |
    | ---- | ---- | ----- | ---------- |
    |      |      |       |            |

- 用于异常处理的关键字

  - | try  | catch | finally | throw | throws |
    | ---- | ----- | ------- | ----- | ------ |
    |      |       |         |       |        |

- 用于包的关键字

  - | import | package |
    | ------ | ------- |
    |        |         |

- 其他修饰符关键字

  - | native | strictfp | transient | volatile | assert |
    | ------ | -------- | --------- | -------- | ------ |
    |        |          |           |          |        |

    

- 用于定义数据类型值的字面值

  - | true | false | null |
    | ---- | ----- | ---- |
    |      |       |      |

#### 保留字

- Java 保留字（reserved word）：现有 Java 版本（jdk 1.8）尚未使用，是以后的版本中可能回作为关键字使用。自己命名标识符时应注意避免使用这些保留字

  - | goto | const |
    | ---- | ----- |
    |      |       |

### 2、标识符

- 标识符

  - Java 对各种变量、方法、类等在命名的时候使用的字符序列称之为标识符
  - 凡是自己可以起名的的地方都可以称之为标识符

- 定义合法标识符的规则，如果不遵循编译将不会通过

  - 由 26 个英文字母大小写，阿拉伯数字 0 - 9，_ 或 $ 组成
  - 数字不可以作为开头
  - 不可以使用关键字和保留字，但能包含关键字和保留字
  - Java 中严格区分大小写，长度无限制
  - 标识符不能包含空格

- 代码演示

  - ```java
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
     * 2、标识符的命名规则
     *      由 26 个英文字母大小写，阿拉伯数字 0 - 9，_ 或 $ 组成
     *      数字不可以作为开头
     *      不可以使用关键字和保留字，但能包含关键字和保留字
     *      Java 中严格区分大小写，长度无限制
     *      标识符不能包含空格
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
    
    ```

### 3、Java 中的名称命名规范

- 包名：多单词组成时所有字母都小写（xxxyyyzzz）

- 类名、接口名：多单词组成时，所有单词的首字母大写（XxxYyyZzz）

  - ```java
    class TestThisCake{
        
    }
    ```

- 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首写字母大写（xxxYyyZzz）

  - ```java
    class Test{
        public static void main(String[] args){
            int myStudentCode = 1001;
            String myFavoriteFoot = "dumplings、noodle、shrimp";
       
                System.out.println(myStudentCode);
            	System.out.println(myFavoriteFoot);
        }
    }
    ```

  - 

- 常量名：所有字母都大写，多单词时每个单词用下划线链接（XXX_YYY_ZZZ）

  - ```java
    // 常量命名规范
    class TestTwo{
      public static void main(String[] args) {
            String PREFIX_MAX_NUMBER = "10000";
            System.out.println("最大的数字：" + PREFIX_MAX_NUMBER);
        }
    }
    ```
    
  - 

- 注意事项

  - 就算不遵循也不会发生任何错误，但是最好按时按照规范编写
  
  - 在起名字时，为了提高代码可读性应尽量有意义，起到“见名知意”的作用
  
  - Java 采用 Unicode 字符集，因此标识符可以可用汉子声明，但不建议使用
  
    - ```java
      // 由于 Java 使用的是 unicode 字符集编码，所以标识符可以取中文名
      class 你好{
          public static void main(String[] args) {
              int 学号 = 1002;
              System.out.println("你好，世界！");
              System.out.println(学号);
          }
      }
      ```



### 4、变量

#### 1、变量的概念

- 内存中的一个存储区域
  - 该区域的数据可以在同一类型范围内不断变化
- 变量是程序中最基本的存储单元。包含了变量类型、变量名和存储的值

#### 2、变量的作用

- 用于在内存中保存数据

#### 3、使用变量的注意事项

- Java 中每个变量必须先声明，后使用
- 使用变量名来访问这块区域的数据
- 变量的作用域：其定义所在的一对 {} 内
- 变量只有在其作用域内生效
- 同一个作用域内，不能定义重名的变量

#### 4、变量的使用

- 1、Java 定义变量的格式：数据类型 变量名 = 变量值;

  - ```java
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
        }
    }
    ```

- 2、Java 程序是按照先后顺序执行，变量需要先加载到内存才能被后续的代码使用。变量必须先声明，后使用

  - 错误的写法一，使用变量之间必须先声明变量

    - ```java
      System.out.println(myNumber);
      int myNumber = 101;
      ```

    - ![1599557831552](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599557831552.png)

  - 错误写法二，定义的变量没有默认值，所以在使用变量之前必须先定义好变量及其值

    - ```java
      int myNumber;
      System.out.println(myNumber)
      ```

    - ![1599564264436](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599564264436.png)

- 3、变量都定义在其作用域内，作用域内，它是有效的。换句话说，出了作用域后变量将无法使用

  - 错误写法

    - ```java
      public class VariableTest {
          public static void main(String[] args) {
              // 无法直接其使用其他方法中的变量
              System.out.println(myClass);
          }
      
          public void method(){
              // 这里的 myClass 变量只能在 method() 这个方法中使用
              int myClass = 1;
          }
      }
      ```

    - ![1599564984416](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599564984416.png)

- 4、同一个作用域内，不可以声明两个相同的变量名

  - 错误写法

    - ```java
      class TestForThree{
          public static void main(String[] args) {
              int number = 5;
              long number = 5;
          }
      }
      ```

    - ![1599565399160](/home/jeffrey/IdeaProjects/JavaReview/Data/Note/images/1599565399160.png)

#### 5、基本数据类型

##### 1、数值型

- | 类型  | 占用存储空间   | 表数范围       |
  | ----- | -------------- | -------------- |
  | byte  | 1 字节 = 8 Bit | -128 ~ 127     |
  | short | 2 字节         | -2^15 ~ 2^15-1 |
  | int   | 4字节          | -2^31 ~ 2^31-1 |
  | long  | 8字节          | -2^63 ~ 2^63-1 |

- Java 各整数类型有固定的表述范围和字段长度，不受具体 OS 的影响，以确保 Java 程序的可移植性

- Java 的整形类型默认为 int 型，声明 long 常量后必须添加 I 或 L

- Java 程序中变量通常声明为 int 型，除非不足以表示较大的数才使用 long 型

- byte（ 1 字节 = 8 Bit ） \ short（ 2 字节 ） \ int （ 4 字节 ）\ long （8 字节）

- ```java
  /**
   * @Author: Jeffrey
   * @Description:
   * @Date: create in 2020/9/8 下午7:57
   * @Version：JDK1.8
   */
  
  /**
   * 1、变量的分类，按数据类型
   * 基本数据类型
   * 整形：byte（ 1 字节 = 8 Bit ） \ short（ 2 字节 ） \ int （ 4 字节 ）\ long （8 字节）
   *   浮点型：float \ double
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
  ```

##### 2、浮点型

- float \ double

##### 3、字符型

- char

##### 4、布尔型

- boolean

##### 5、引用数据类型

- 类：class
- 接口：interface
- 数组：array

#### 6、变量在类中的声明的位置

- 成员变量
- 局部变量

#### 5、基本数据类型变量间的转换

#### 6、基本数据类型与 String 间的转换

#### 7、进制与进制间的转换



### 4、运算符

### 5、程序流程控制