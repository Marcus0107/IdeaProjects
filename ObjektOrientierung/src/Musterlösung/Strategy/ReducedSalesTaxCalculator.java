package Musterlösung.Strategy;

import Musterlösung.Builder.Invoice;
import Musterlösung.Builder.LineItem;
import Musterlösung.Immutability.Money;

/**
 * Created by Marcus on 07.04.2017.
 */
public class ReducedSalesTaxCalculator {
    private final double percentageNormal;
    private final double percentageReduced;

    public ReducedSalesTaxCalculator( double percentageNormal, double percentageReduced ) {
        this.percentageNormal = percentageNormal;
        this.percentageReduced = percentageReduced;
    }


    public Money calculate(Invoice invoice ) {
        Money netNormal = new Money( 0 );
        Money netReduced = new Money( 0 );

        for ( LineItem lineItem : invoice.getLineItems() ) {
            if ( isReduced( lineItem ) ) {
                netReduced = netReduced.add( lineItem.getSum() );
            }else {
                netNormal = netNormal.add( lineItem.getSum() );
            }
        }

        return netNormal.multiply( percentageNormal )
                .add( netReduced.multiply( percentageReduced ) );
    }

    protected boolean isReduced( LineItem lineItem ) {
        return lineItem.getDescription().contains( "reduced" );
    }
}
