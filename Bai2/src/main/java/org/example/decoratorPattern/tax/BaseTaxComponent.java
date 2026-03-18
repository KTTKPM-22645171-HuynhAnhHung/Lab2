// Java
package org.example.decoratorPattern.tax;

public class BaseTaxComponent implements TaxComponent {
    private double price;

    public BaseTaxComponent(double price) {
        this.price = price;
    }

    @Override
    public double calculate() {
        return 0;
    }

    public double getPrice() {
        return price;
    }
}