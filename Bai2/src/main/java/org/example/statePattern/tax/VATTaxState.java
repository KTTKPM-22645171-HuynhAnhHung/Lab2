// Java
package org.example.statePattern.tax;

public class VATTaxState implements TaxState {
    @Override
    public double calculateTax(ProductStateful product) {
        return product.getPrice() * 0.08;
    }
}