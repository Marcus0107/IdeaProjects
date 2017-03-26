package Vorlesung1.Immutability;

/**
 * Created by Marcus on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) throws  Exception {


            Money one = new Money(3, 10);
            Money two = new Money(2, 51);
            Money sum = Money.AddUpMoney(one, two);
            Money subst = Money.SubstractMoney(one, two);
            Money multi = Money.Multiply(two, 2.801);
            sum.Print();
            subst.Print();
            multi.Print();




    }
}
