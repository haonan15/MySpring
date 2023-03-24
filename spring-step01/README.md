## 实现一个简单的Bean容器
- 定义：BeanDefinition
- 注册：把定义bean对象信息存放到 HashMap 中
- 获取：Spring 容器初始化好 Bean 进行获取
### 整体设计
![](https://mmbiz.qpic.cn/sz_mmbiz_png/zTfAIs5rNXjice2EpE8SdmY3gVgzGsutTx38zVDZXclZcZNkNNC2Z7GWuyTLAbBsDfC2OemswCk0pORibCjZJkvA/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)
### 类关系图
![](https://mmbiz.qpic.cn/sz_mmbiz_png/zTfAIs5rNXjice2EpE8SdmY3gVgzGsutTU99QDtXClLJQx1xlLqPiao5ibT9rsjZHwhicAUyArzJZYgdicgckVRfwxw/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)