// Java
package org.example.decoratorPattern.tax;

public class VATTaxDecorator extends TaxDecorator {
    public VATTaxDecorator(TaxComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double calculate() {
        double price = ((BaseTaxComponent) getBase()).getPrice();
        return super.calculate() + price * 0.08;
    }

    private TaxComponent getBase() {
        TaxComponent current = wrappee;
        while (current instanceof TaxDecorator) {
            current = ((TaxDecorator) current).wrappee;
        }
        return current;
    }
}