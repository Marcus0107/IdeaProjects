package Übungsaufgaben.Builder;

import java.util.LinkedList;

/**
 * Created by Marcus on 12.04.2017.
 */
public class InvoiceBuilder
{
    private  LinkedList<LineItem> lineItemList;
    public InvoiceBuilder()
    {
        lineItemList = new LinkedList<>();
    }

    public void addLineItem(LineItem item){
        lineItemList.add(item);
    }

    public void removeLineItem(LineItem item){
        lineItemList.remove(item);
    }

    public  Invoice create(){
        return new Invoice(lineItemList);
    }
}
