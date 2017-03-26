package Vorlesung1.Immutability.Tests;


import Vorlesung1.Immutability.Tests.MoneyClass.AddTest;
import Vorlesung1.Immutability.Tests.MoneyClass.MultiplyTest;
import Vorlesung1.Immutability.Tests.MoneyClass.SubstractTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AddTest.class,
        SubstractTest.class,
        MultiplyTest.class
})
public class TestSuite
{
}
