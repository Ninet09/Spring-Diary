# Spring-Practice

---
## Day 1
### Spring IOC的作用:
    使用加载配置文件的方式替代在代码中用new xxx()的方式来实例化对象。

### 依赖注入有两种方式:

#### 1. 设值注入
    通过添加set方法，并在配置文件的bean中添加property标签，而此property标签引用另一个bean的方式注入。
#### 2. 构造注入
    通过构造方法，并在配置文件的bean中添加constructor-arg标签的方式注入。
---
## Day 2
### BeanScope
#### 1.singleton(Default)
    scope = "singleton" 单列，指一个Bean容器中只存在一份。
#### 2.prototype
    scope = "prototype" 每次请求创建新的实例，destroy方法不生效。
    
### Bean生命周期
#### 初始化的方式
    1.实现org.springframework.beans.factory.InitailizingBean接口，覆盖afterProperyiesSet()方法。
    2.配置init-method。


