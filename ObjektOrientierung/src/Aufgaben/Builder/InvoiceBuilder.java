package Aufgaben.Builder;

import java.util.ArrayList;

/**
 * Created by Marcus on 31.03.2017.
 */
public class InvoiceBuilder {
        public ArrayList<LineItem> lineItemList;

    public InvoiceBuilder() {
       lineItemList = new ArrayList<>();
    }

    public void addLineItem(LineItem lineItem){
            lineItemList.add(lineItem);
        }

        public void removeLineItem(LineItem lineItem){
            lineItemList.remove(lineItem);
        }

        public Invoice create(){
            return  new Invoice(lineItemList);
        }
}
