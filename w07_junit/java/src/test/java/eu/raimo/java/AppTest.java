package eu.raimo.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static App app;
    private static String name;

    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp(){
        name = "Raimo";
        app = new App(name);
    }

    @Test
    public void appHasCorrectName(){
        assertTrue("App name is Raimo", app.getName() == name);
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo(){
        assertEquals("One equals two", 1, 2);
    }

    @Test
    public void getMaxValue(){
        assertEquals("Get max value", 15, app.maxValue(12, 15));
    }

    @Test
    public void appsAreEqual(){
        App app1 = new App("Raimo");
        app1.code = 12;
        App app2 = new App("Raimo");
        app2.code = 55;

        assertEquals(app1, app2);

    }

    @Test
    public void randomTest(){
        
    }
}
