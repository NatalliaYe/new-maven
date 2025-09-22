
import org.example.Commode;
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.*;

public class MyTestOne {

    @BeforeSuite
    public void beforeSuiteTests() {
        System.out.println("Test before test-suite.");
    }

    @BeforeTest
    public void beforeTestTests() {
        System.out.println("   Test before tests.Test One.");
    }

    @BeforeGroups
    public void beforeGroupsTests() {
        System.out.println("       Test before  group of tests.");
    }

    @Test(groups = "positive")
    public void getSquareTest() {
        Commode clothesCommode = new Commode();
        double area = 2 * (clothesCommode.height * clothesCommode.width + clothesCommode.length * clothesCommode.height
                + clothesCommode.length * clothesCommode.width);
        System.out.printf("Commode square: %.2f",area);
    }

    @Test(groups = "positive")
    public void myTest() {
        String result = Main.MyInfo();
        System.out.println("CommodeType- clothesCommode." + " Number of drawers is 4.");
    }

    @Test(groups = "positive")
    public void testSum (){
       double result = Main.sum(4, 5);
        Assert.assertEquals (result, 9);
    }

    @Test(groups = "positive")
    public void testSetDrawers() {
        Commode commode = new Commode();
        int result = commode.setDrawers(4);
        Assert.assertTrue(result ==4, "The number od drawers is incorrect. ");
    }

    @Test(groups = "positive")
    public void testGetSquare() {
        Commode commode = new Commode();
        double result = commode.getSquare();
        assertFalse(result == 160);
    }
    @Test(groups = "positive")
    public void testGetSquareShouldFail() {
        Commode commode = new Commode();
        double result = commode.getSquare();
        if (commode.getSquare() == 0)
        Assert.fail("This test should fail");
        System.out.println("This test should fail. ");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void methodDivideException() {
        Main.divide(5,0);
    }

    @AfterGroups
    public void afterGroupsTests () {
        System.out.println("      Test after group of tests.");
    }
    @AfterTest
    public void afterTestTests() {
        System.out.println("Test after tests.Test One.");
    }

    @AfterSuite
    public void afterSuiteTests() {
        System.out.println("Test after test-suite.");
    }
}
