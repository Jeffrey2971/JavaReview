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

## 4、运行机制及运行过程

## 5、Java 的环境搭建

## 6、开发体验：HelloWorld

## 7、常见问题及解决方法呢

## 8、注解（Comment）

## 9、Java API 文档

## 10、良好的编程风格

## 11、常用的 Java 开发工具	