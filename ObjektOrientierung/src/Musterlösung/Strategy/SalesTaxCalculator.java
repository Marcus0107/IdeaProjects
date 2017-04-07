package Musterlösung.Strategy;

import Musterlösung.Builder.Invoice;
import Musterlösung.Immutability.Money;

/**
 * Created by Marcus on 07.04.2017.
 */
public interface SalesTaxCalculator {
    /**
     * Calculates the sales tax for a given net value
     *
     * @param invoice the invoice
     * @return the sales tax
     */
    Money calculate(Invoice invoice );
}
