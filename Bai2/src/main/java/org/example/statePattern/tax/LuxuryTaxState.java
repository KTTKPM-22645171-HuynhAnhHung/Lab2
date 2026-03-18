// Java
package org.example.statePattern.tax;

public class LuxuryTaxState implements TaxState {
    @Override
    public double calculateTax(ProductStateful product) {
        return product.getPrice() * 0.2;
    }
}