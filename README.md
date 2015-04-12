介绍
====
这是 [IT干货技术分享网](http://www.itganhuo.cn) 整站开源项目。欢迎更多的爱好者参与进来帮助我们一起成长，同时也欢迎你加入私塾在线学习社区群 [329232140](http://shang.qq.com/wpa/qunwpa?idkey=2c2c4eb461fefa1763887c68a4658a6ff2bf7bd4c717332ebd0c21fc824454ae)。

网站
====
IT干货技术分享网 http://itganhuo.cn 是为开发人员提供一个工作经验交流和分享的社区平台，它的目标是降低大家准确获取信息的成本，在这个网站上面有别人分享的真正干货，其代码或解决方案拿来就可以使用。上面没有长篇大论的描述，因为你需要的只是拿来即用，并非在此刻详细的了解它。或许你之前有了解过，只是现在忘了具体的使用语法。社区的生成离不开你我他的参与，欢迎你也分享自己的工作经验，让更多的人受益。

下载
====
如果你想下载源码可以采用以下两种方式：
* 单击项目主页右边"Download ZIP"下载zip文件，需要说明的是这种方法并不会含有版本信息；
* 使用Git Bash或Torties Git下载，此时你需要先下载其中一个工具（具体百度之），然后克隆本项目地址https://github.com/xiaoxing598/itganhuo.git （这个地址可以在项目主页右边"clone URL"找到）；
* 你可以参考本群录制的视频：[http://yun.baidu.com/s/1jGFwbps](http://yun.baidu.com/s/1jGFwbps#path=%252FJAVA%25E7%25A7%2581%25E5%25A1%25BE%25E5%259C%25A8%25E7%25BA%25BF%25E5%25AD%25A6%25E4%25B9%25A0%25E7%25A4%25BE%25E5%258C%25BA%25E7%25BE%25A4329232140%25E5%2585%25B1%25E4%25BA%25AB%252F%25E7%25BE%25A4%25E6%258A%2580%25E6%259C%25AF%25E4%25BA%25A4%25E6%25B5%2581%25E5%2588%2586%25E4%25BA%25AB%25E4%25BC%259A%25E8%25A7%2586%25E9%25A2%2591%252FGit%25E7%2589%2588%25E6%259C%25AC%25E7%25AE%25A1%25E7%2590%2586%25E5%25B7%25A5%25E5%2585%25B7%25E4%25BD%25BF%25E7%2594%25A8)

参与
====
如果你想实际参与本项目后续开发或者发现了项目bug需要参与进来，那么可以通过以下途径：
* 默认任何人都有克隆本项目权限，如果你发现了bug并修复了然后想提交到源码上，此时你可以通过在线Requst Pull提交自己的代码，项目负责人看到你的请求之后视情况给予审核；
* 如果你的贡献代码比较多那么此时可考虑申请由贡献者变成开发者，我们会添加你本地的公钥（KEY），后续你就可以自由的通过SSH通道下载和提交代码了。

配置
====
下载项目后要想成功运行起来请遵照下面的步骤：
* 以Maven项目导入到开发工具中（以Spring Tool Suite为例）：
File > Import > (Maven > Existring Maven Projects) > 选择项目所在路径即可。

修改数据库连接信息（如果你想使用我们提供的公有数据库则忽略此项）：
* 从`src/main/resources`中找到`itganhuo.sql`文件用来创建数据库；
* 从`src/main/resources`中找到`jdbc.properties`文件将相应信息修改成你自己的； 
* 注意：目前数据库连接信息是加密的，你可以通过`cn.itganhuo.app.common.TestAes.testEncrypt()`测试类来生成加密后的字符串。

启动
====
本项目采用Maven + Jetty构建而无需Tomcat就可运行（当然如果你将项目放到Tomcat里面运行也是可以的）：
* 直接在项目上运行`mvn jetty:run`来运行，但如果你是在IDE工具里那可在项目上右击选择Run As > Maven build... > 在Goals框中输入`clean package jetty:run`并回车即可。
* 浏览器访问：http://localhost:8080/app

包结构说明
====
为帮助大家熟悉项目下面把主要的包和文件说明一下
```
+app
|  +src/main/java
|  |  +cn.itganhuo.app
|  |  |  +common（工具类）
|  |  |  +dao（数据层交互类）
|  |  |  +entity（实体数据封装）
|  |  |  +exception（自定义异常类）
|  |  |  +service（服务层接口实现）
|  |  |  +web（用户界面控制）
|  +src/main/resources
|  |  +cn（包含DAO层的实现，这里采用了MyBatis框架）
|  |  -config-pool.properties（变量文件配置）
|  |  -itganhuo.sql（数据库建构语句）
|  |  -jdbc.properties（数据库连接信息）
|  |  -log4j.xml（1.x版本适用的日志框架，主要是第三方框架用）
|  |  -log4j2.xml（2.x版本在本项目中采用，整体性能比前版本要高很多。）
|  |  -resources.properties（资源配置）
|  |  -root-context.xml（spring基本配置）
|  |  -servlet-context.xml（MVC基本配置）
|  |  -spring-javamail.xml（邮件基本配置）
|  |  -spring-shiro.xml（权限基本配置）
|  +src/test/java
|  |  +cn.itganhuo.app（单元测试类）
|  +src/test/resources
|  +logs（日志输出文件夹）
|  +src（存放用户界面的具体文件）
|  +target（存放maven编译后的文件）
|  -LICENSE（开源许可证）
|  -pom.xml（maven项目构建配置）
|  -README.md（本项目介绍说明）
```

技术关键词
====
<<<<<<< HEAD
Spring frame, Spring MVC, Apache Shiro, MyBatis, MySql, maven, jetty, JavaMail, easyui, meituUI, freemarker, git, druid, (lucene or solr)
=======
springmvc, mybatis, shiro, maven, javamail， MVC, easyui, meituUI, (lucene or solr)
>>>>>>> note

开发者说
====
2014年5月，由java私塾学习群的部分人员提出倡议，开会讨论并通过建立IT干活技术分享网的提案。本网站目的在于为广大程序员提供一个技术交流与沟通的平台，其本身开发难度并非很复杂，所以同时是为刚刚入门学习编程的同学们有一个借鉴与学习提供一个模板。当然，这么说有些片面，因为写程序本身就是天马行空，存在即是合理，只是希望正在学习的同学能够跟上软件行业发展的步伐，增强信心。
开发团队中的人员分布在全国各地，有些是从业很久的大牛，也有刚刚转行或入行的新人，平时大家都有自己的工作与生活，愿意拿出部分时间去完成这个项目，凭借的是心中那份对编程的喜欢、热爱、痴迷，当然也收获着合作与成果的喜悦。也许您已经是这个行业里的专家，但毋庸置疑的事，您也像我一样深深地爱着这份行业。毕竟处于当前物质文明飞速发展的时代，从事软件开发行业，喜欢并不是唯一的标准，更多的人是看到高额的收入与回报。恰恰在这个过程中，您会渐渐发现，在不断面临新的难题，学习，尝试，失败，再学习，再尝试直至成功的这个循环过程中，能够把它实现出来的这个过程，恰恰又是我们所享受并快乐着的。
勿忘初心，当我们在路上渐行渐远，有时会被许多不合理但又必须去做，不断改变的需求搞得心情一团糟，这时候就需要偶尔停下，回归原始，从每一个hello world重新开始追寻自己的梦想。开发团队在做的，就是一些志同道合的朋友，在一起做一些好玩的事儿，能够可以改善人们生活的事儿。当然，目前开发工作并没有结束，所以我们会一直做下去，也希望有同样志愿的您加入到我们当中，共同学习，共同进步,我们也会一如既往的坚持做下去。如果您有什么好的创意与想法，可以与我们联系。
最后祝各位身体健康，工作顺利，学业有成，万事如意！

Thanks!
<<<<<<< HEAD

=======
>>>>>>> note
IT干货技术分享网:heart:开发团队
