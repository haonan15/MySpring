## 实现 Bean 的定义、注册、获取
### 整体设计
![](https://mmbiz.qpic.cn/sz_mmbiz_png/zTfAIs5rNXgFKsdhYPnl9xjhNgACibOl19LUwf4hOUBjneZUh9I62cPesc2ojEJmjNxxFjyZB97LD0yQmz6TQCw/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)
### 类关系图
![](https://mmbiz.qpic.cn/sz_mmbiz_png/zTfAIs5rNXgFKsdhYPnl9xjhNgACibOl1tB4icOtEDFtRvm5PPWosCmfL31P31K0LGfrzZzDVI3FS3Qkjg46ib4iaQ/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)
### 测试
两次获取对象：第一次是获取 Bean 时直接创建的对象，另外一次是从缓存中获取的实例化对象。