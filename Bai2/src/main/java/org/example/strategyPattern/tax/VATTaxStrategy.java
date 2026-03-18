// Java
package org.example.strategyPattern.tax;

public class VATTaxStrategy implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.08;
    }
}