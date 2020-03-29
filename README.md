# MVCTest
MVC：

可以算的上经典的框架，框架基本的框架就是Model-View-Control（模型-视图-控制），应用在Android中也就是（对象-控件-控制器），一般来说在项目不算庞大，需求更改不频繁的情况下，MVC的框架设计是较为合适的。
比方说，有一个View会提交数据给Model进行处理以实现具体的行为，View通常不会直接提交数据给Model，它会先把数据提交给Controller，然后Controller再将数据转发给Model。假如此时程序业务逻辑的处理方式有变化，
那么只需要在Controller中将原来的Model换成新实现的Model就可以了，控制器的作用就是这么简单， 用来将不同的View和不同的Model组织在一起，顺便替双方传递消息
，仅此而已。 

组成MVC的三个模式分别是组合模式、策咯模式、观察者模式，MVC在软件开发中发挥的威力，最终离不开这三个模式的默契配合。

View层，单独实现了组合模式
View层和Controller层，实现了策咯模式
Model层和View层，实现了观察者模式

注意到MVC的Control层，在这一框架下需要在Activity或是Fragment中处理太多逻辑，View与Model之间的交互都是在其中完成的，很大程度上让View变得有些臃肿，这也就是MVC的缺点体现。
