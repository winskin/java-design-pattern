# 生成器模式（或 建造者模式、 Builder）

生成器模式是一种创建型设计模式，使你能够分步骤创建复杂对象。该模式允许你使用相同的创建代码生成不同类型和形式的对象。

## 生成器模式结构

1. 生成器：接口声明在所有类型生成器中通用的产品构造步骤。
2. 具体生成器：提供构造过程的不同实现。具体生成器也可以构造不遵循通用接口的产品。
3. 产品：是最终生成的对象。由不同生成器构造的产品无需属于同一类层次结构或接口。
4. 主管 （Director）：类定义调用构造步骤的顺序，这样你就可以创建和复用特定的产品配置。
5. 客户端：必须将某个生成器对象与主管类关联。一般情况下，你只需通过主管类构造函数的参数进行一次性关联即可。此后主管类就能使用生成器对象完成后续所有的构造任务。但在客户端将生成器对象传递给主管类制造方法时还有另一种方式。在这种情况下，你在使用主管类生产产品时每次都可以使用不同的生成器。

## 优缺点
- √ 你可以分步创建对象，暂缓创建步骤或递归运行创建步骤。
- √ 生成不同形式的产品时，你可以复用相同的制造代码。
- √ 单一职责原则。你可以将复杂构造代码从产品的业务逻辑中分离出来。
- × 由于该模式需要新增多个类，因此代码整体复杂程度会有所增加。

## 简单说

### 经典builder：



客户想买一台笔记本，在官网选好型号后下单，公司通知（builder）工厂（Director）进行组装，完成后交付给用户。
- 客户端创建一个builder，交给Director
- Director只是负责组装，组装后返回builder对象给客户端
- 客户端从builder回去结果对象

### 现在常用的builder：

是一个变种，用于构建对象，生成的对象不可更改。
- 客户端创建一个builder
- 客户端自定义设置值
- 客户端调用.build()方法进行实例化对象（执行后对象不可更改）