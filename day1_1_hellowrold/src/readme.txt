 android的层次结构：

   应用层(QQ,短信管理,通讯录)
--------------------------
   框架层
---------------------------
   dalvik(虚拟机)+library
   -----------------
   linux(来源于unix)
----------------------------------------------------------------------------
开发第一个android应用程序的步骤:
1)下载androidSDK，该SDK包含在android操作系统中
  网址:http://developer.android.com/
2)配置环境变量(参照视频)
3)配置eclipse和androidSDK(参照视频)
4)写程序
----------------------------------------------
src:     Java源代码
gen:     存放系统生成的资源名称类文件
             R.java  (R=Resource=资源),该文件有系统自动生成
assets:  中文:资产,用于存放字体文件等资源
bin:     存放编译后生成的安装程序,比如:hw.apk
res:     存放图片、声音、XML配置文件等资源
         drawable-hdpi:大图片
         drawable-ldpi:小图片
         drawable-mdpi:中图片
         drawable-xhdpi:超大图片
         layout(布局):存放界面布局文件
         value(值):存放常量值
androidManifest.xml (android清单文件)：
        用于配置android工程需要的组件
        
proguard-project.txt:
project.propreties  :  用于加密生成的安装文件
---------------------------------------------------------------
创建界面窗口的步骤:
 1)定义类MainActivity,必须继承Activity类
 2)重写onCreate()方法
 3)调用setContentView()方法,加载界面内容布局文件
 4)在androidMenifest.xml清单文件中注册
----------------------------------------------------------------
引用资源文件的方式:
 1)Java代码中使用R
 2)xml文件中使用@       
         












        