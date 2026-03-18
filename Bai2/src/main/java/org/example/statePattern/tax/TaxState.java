// Java
package org.example.statePattern.tax;

import org.example.statePattern.tax.ProductStateful;

public interface TaxState {
    double calculateTax(ProductStateful product);
}