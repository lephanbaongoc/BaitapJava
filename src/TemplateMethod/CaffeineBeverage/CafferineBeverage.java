package TemplateMethod.CaffeineBeverage;

public abstract class CafferineBeverage {
    protected StringBuilder builder = new StringBuilder();

    public StringBuilder prepareRecipe() {
        boilWater();
        brew();
        puorInCup();
        addCondiments();
        return builder;
    }

    void boilWater() {
        builder.append("Nấu nước sôi\n");
    }

    void puorInCup() {
        builder.append("Chế ra ly\n");
    }

    abstract void brew();

    abstract void addCondiments();
}
