package Musterlösung.AbstractFactory;

/**
 * Created by Marcus on 07.04.2017.
 */
public class Receiver {
    private final String name;
    private final String address;

    public Receiver( String name, String address ) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
