# Java 入门

## 1、软件开发介绍

- 软件开发

  软件，及一些列按照特定顺序组织的计算机数据和指令的集合，有系统软件和应用软件之分

- 人机交互方式
  - 图形化界面
    - 这种方式简单直观，使用者十分方便，容易上手操作
  - 命令行方式
    - 需要一个控制台，输入一些特定的命令，让计算及完成制定的操作。这种方式较为麻烦且需要记住一些命令
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

## 2、计算机编程语言介绍

- ### 1、什么是计算机语言

  - 语言：语言是人与人之间沟通的一种方式。例如：中国人与中国人之间使用普通话进行交流，而中国人与外国人交流就需要学习英语，或者外国人学习中文

  - 计算机语言就是人与计算机之间“沟通交流”的语言。而计算机语言有多种。例如：C、C++、Java、PHP、Kotlin、Python、Scala 等等。
  - 第一代语言，机器语言
    - 指令以二进制代码形式存在
  - 第二代语言，汇编语言
    - 使用助记符表一条机器指令
    - ![1599216679243](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599216679243.png)
  - 第三代语言，高级语言
    - C、Pascal、Fortran 面向过程的语言
    - C++  ，面向过程/面向对象
    - Java 夸平台的纯面向对象的语言
    - .NET 跨语言的平台
    - Python、Scala ...

- ### 2、Why is Java

  - ![1599217399882](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599217399882.png)
  - ![1599220279171](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599220279171.png)

## 3、Java 语言概述

- ### 1、语言概述

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

- ### 2、Java 技术体系平台

  - Java SE 标准版
    - 支持面向桌面级应用（例如 Windows 下的应用程序）的 Java 平台，提供了完善的 Java 核心 API，此版本以前称为 J2SE
  - Java EE 企业版
    - 是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如：Servlet、JSP 等，主要针对 Web 应用程序的开发，此版本以前称为 J2EE
  - Java ME 小型版
    - 支持 Java 程序运行在移动端（例如手机、pad）上的平台，对 JavaAPI 有所精简，并加入了针对移动端的终端支持，此版本之前称之为 J2ME
  - Java Card
    - 支持一些 Java 小程序（Applets）运行在小内存设备上（例如智能卡等）上的平台

- ### 3、Java 在各领域中的应用

  - 企业级应用
    - 主要是指大型企业中复杂的软件系统，各种类型的网站。Java 的安全机制以及它的跨平台优势，使它在分布式系统领域开发中有着广泛的应用（包括金融领域、电信领域、交通领域、电子商务等领域）
  - Android 平台应用
    - Android 应用程序使用 Java 语言编写。Android 开发水平的高低很大程度上取决于 Java 语言核心能力是否扎实
  - 大数据平台开发
    - 各种框架有 Hadoop、spark、storm、flink 等，就这类技术生态圈来讲，还有各种中间件，例如flume、kafka、sqoop 等等，这些框架以及工具大多数是使用 Java 语言编写的，但提供诸如 Java、Scala、Python 、R 等各种语言 API 工编程。
  - 移动领域应用
    - 主要表现在消费和嵌入式领域，是指在各种小型设备上使用，包括手机、机顶盒、PAD、汽车通信设备等

- ### 4、Java 语言的诞生

  - ![1599223772366](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599223772366.png)

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

## 4、运行机制及运行过程

### 1、Java 语言的特点

- 特点一：面向对象
  - 两个基本的概念：类、对象
  - 三大特性：封装、继承、多态
- 特点二：健壮性
  - 吸收了 C/C++ 语言的特点，但去掉了影响程序健壮性的部分（例如指针、内存的申请与释放等），提供了一个相对安全的内存管理和访问机制
- 特点三：跨平台性
  - 跨平台性：通过 Java 语言编写的应用程序在不同的系统平台上都可以运行
  - 原理：只要在需要运行 Java 应用程序的操作系统上，先安装一个 Java 虚拟机即可，由 JVM 来负责 Java 程序在该系统中的运行
  - ![1599226679925](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599226679925.png)
- Java 的两种核心机制
  - Java 虚拟机
    - ![1599226977214](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599226977214.png)
  - 垃圾回收机制
    - 不再使用的内存空间应被回收：垃圾回收
      - 在 C/C++ 等语言中，有程序员负责回收无用的内存空间
      - Java 语言消除了程序员回收内存的责任，它提供一种系统线程跟踪存储空间的分配情况，并在 JVM 空闲时检查并释放那些可被释放的内存空间
    - 垃圾回收在 Java 程序运行过程中自动进行，程序员无法精确控制和干预
    - **即使这样，如果代码编写有 bug ，Java 程序还是有可能会出现内存泄露和内存溢出的问题**

## 5、Java 的环境搭建

### 1、什么是 JDK，JRE，JVM

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
  - ![1599238304109](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599238304109.png)
- 官网解释
  - ![1599238821367](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599238821367.png)

### 2、下载并安装 JDK

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

## 6、HelloWorld

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

  - ![1599325561292](/home/jeffrey/IdeaProjects/JavaReview/Java_入门_01/Note/images/1599325561292.png)

- 

## 7、常见问题及解决方法

## 8、注解（Comment）

- 单行注释：可以在任意一行代码上使用 // 表示单行注释，在 // 后的所有内容都不会被执行

  - ```java
    class helloWorld{
        public static void main(String[] args){
            System.out.print("Hello,World!"); // 我的第一个 Java 程序
        }
    }
    ```

  - 

- 多行注释：可以在任意一处地方使用 /** 注释内容 **/ 表示多行注释，在期间的所有内容都不会被执行

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
    

## 9、Java API 文档

## 10、良好的编程风格

## 11、常用的 Java 开发工具	