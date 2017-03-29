Spring-Practice
===
---
Day 1
---
### spring IOC的作用:<br>
    使用加载配置文件的方式替代在代码中用new xxx()的方式来实例化对象。

### 依赖注入有两种方式:<br>

#### 1. 设值注入
    通过添加set方法，并在配置文件的bean中添加property标签，而此property标签引用另一个bean的方式注入。
#### 2. 构造注入
    通过构造方法，并在配置文件的bean中添加constructor-arg标签的方式注入。
