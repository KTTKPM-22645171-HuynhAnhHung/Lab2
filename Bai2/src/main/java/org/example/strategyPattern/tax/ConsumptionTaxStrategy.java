// Java
package org.example.strategyPattern.tax;

public class ConsumptionTaxStrategy implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}