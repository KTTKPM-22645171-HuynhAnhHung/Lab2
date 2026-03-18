// Java
package org.example.strategyPattern.tax;

public class ProductStrategy {
    private double price;
    private TaxStrategy taxStrategy;

    public ProductStrategy(double price) {
        this.price = price;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        if (taxStrategy == null) return 0;
        return taxStrategy.calculate(price);
    }
}