package Übungsaufgaben.AbstractFactory;

/**
 * Created by Marcus on 12.04.2017.
 */
public class Receiver
{
    final String name;
    final String address;

    public Receiver(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "\nname= " + name +
                "\naddress= " + address ;
    }
}
