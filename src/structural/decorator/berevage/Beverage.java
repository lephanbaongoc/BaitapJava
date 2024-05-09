package structural.decorator.berevage;

public abstract class Beverage {
    String description;
    public Beverage (String description){
        this.description = description;
    }
    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
