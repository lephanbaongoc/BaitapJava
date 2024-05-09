package structural.decorator.berevage;

public class Sugar extends CondimentDecorator{
    public Sugar(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }
}
