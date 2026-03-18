// Java
package org.example.decoratorPattern.tax;

public abstract class TaxDecorator implements TaxComponent {
    protected TaxComponent wrappee;

    public TaxDecorator(TaxComponent wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double calculate() {
        return wrappee.calculate();
    }
}