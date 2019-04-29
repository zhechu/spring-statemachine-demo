# spring statemachine教程源码

#### 介绍
我写的spring statemachine 教程源码

#### 软件架构
使用spring boot，spring statemachine


#### 安装教程

1. 下载代码
2. maven请自行搞定
3. 运行StatemachineApplication
4.用浏览器http://localhost:9991/statemachine/

#### 使用说明

1. http://localhost:9991/statemachine/testSingleOrderState 最简单的运行一个订单状态机演示
2. http://localhost:9991/statemachine/testOrderState 使用StateMachineBuilder创建的多个状态机演示
3. http://localhost:9991/statemachine/testFormState 多种状态机的演示（上面都是order的状态机，这个是form的状态机）
4. http://localhost:9991/statemachine/testMemoryPersister 在内存中持久化状态机的演示
5. http://localhost:9991/statemachine/testMemoryPersisterRestore 从内存中取出状态机的演示，和上面是一对
6. http://localhost:9991/statemachine/testRedisPersister 使用redis作为状态机持久化的演示
7. http://localhost:9991/statemachine/testRedisPersisterRestore 从redis取出状态机的演示，显然和上面是一对

#### 教程看我的博客
https://my.oschina.net/u/173343/blog/3043965 废话篇 <br/>
https://my.oschina.net/u/173343/blog/3043967 跑起来篇 <br/>
后面还在写