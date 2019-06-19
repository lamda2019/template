package com.wsc.coffee;
public abstract class CaffeineBeverage {
    // 现在，用同一个prepareRecipe()方法来处理茶和咖啡。
    // prepareRecipe()方法被声明为final，因为我们不希望子类覆盖这个方法
    // 我们将第2步和第4步泛化成为brew()和addCondiments()
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 因为咖啡和茶处理这些方法的做法不同，所以这两个方法必须被声明为抽象，
    // 剩余的东西留给子类去操心
    abstract void addCondiments();
    abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}