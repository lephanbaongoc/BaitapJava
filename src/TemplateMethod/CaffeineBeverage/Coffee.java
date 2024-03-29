package TemplateMethod.CaffeineBeverage;

public class Coffee extends CafferineBeverage {

    @Override
    void brew() {
        builder.append("Pha cà phê xay sẵn\n");
    }

    @Override
    void addCondiments() {
        builder.append("Cho sữa\n");
    }

}
