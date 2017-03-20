package Vorlesung1.Immutability;
import  java.*;
/**
 * Created by Marcus on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Euro one = new Euro(3,51);
        Euro two = new Euro(2,5);
        Euro sum = Euro.AddUpTwoEuros(one,two);
        Euro subst = Euro.SubstractTwoEuros(one,two);
        Euro multi = Euro.Multiplikate(two,1.49);
        sum.Print();
        subst.Print();
        multi.Print();

    }
}
