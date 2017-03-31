package Tests;


import Tests.MoneyClass.AddTest;
import Tests.MoneyClass.MultiplyTest;
import Tests.MoneyClass.SubstractTest;
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
