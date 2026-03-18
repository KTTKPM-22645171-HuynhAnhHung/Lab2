// Java
package org.example.decoratorPattern.tax;

public class ConsumptionTaxDecorator extends TaxDecorator {
    public ConsumptionTaxDecorator(TaxComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double calculate() {
        double price = ((BaseTaxComponent) getBase()).getPrice();
        return super.calculate() + price * 0.1;
    }

    private TaxComponent getBase() {
        TaxComponent current = wrappee;
        while (current instanceof TaxDecorator) {
            current = ((TaxDecorator) current).wrappee;
        }
        return current;
    }
}