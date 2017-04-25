package Übungsaufgaben.Strategy;

import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Money;

/**
 * Created by Marcus on 24.04.2017.
 */
public interface TaxCalculator
{
     Money calculate(Invoice invoice);
}
