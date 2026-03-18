// Java
package org.example.statePattern.tax;

public class ProductStateful {
    private double price;
    private TaxState taxState;

    public ProductStateful(double price) {
        this.price = price;
    }

    public void setTaxState(TaxState taxState) {
        this.taxState = taxState;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTax() {
        if (taxState == null) return 0;
        return taxState.calculateTax(this);
    }
}