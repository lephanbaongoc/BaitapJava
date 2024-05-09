package structural.decorator.berevage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

}
