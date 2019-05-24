import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }


    @Test
    public void testSize(){
        assertSame(0, emptyKitchen.tortillas.length);
        assertSame(1, kitchenWithOne.tortillas.length);
        // Testing sizes is tricky set boundaries is always a good idea
        // test 0, 1 and many (!2)
        assertSame(4, kitchenWithMany.tortillas.length);
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }
}
