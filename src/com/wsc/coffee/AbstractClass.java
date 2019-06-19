package com.wsc.coffee;

//这就是我们的抽象类。它被声明为抽象，用来作为基类，其子类必须实现其操作
public abstract class AbstractClass {
 // 这就是模板方法。它被声明为final，以免子类改变这个算法的顺序。
 final void templateMethod() {
     // 模板方法定义了一连串的步骤，每个步骤由一个方法代表
     primitiveOperation1();
     primitiveOperation2();
     concreteOperation();
 }

 // 在这个范例中有两个原语操作，具体子类必须实现它们
 abstract void primitiveOperation1();
 abstract void primitiveOperation2();
 
 // 这个抽象类有一个具体的操作。
 void concreteOperation() {
     // ...
 }
}