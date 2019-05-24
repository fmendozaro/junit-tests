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
        assertSame(0, emptyKitchen.size());
        assertSame(1, kitchenWithOne.size());
        // Testing sizes is tricky set boundaries is always a good idea
        // test 0, 1 and many (!2)
        assertSame(4, kitchenWithMany.size());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testRemove(){
        kitchenWithOne.pop();
        assertSame(0, kitchenWithOne.size());
        kitchenWithMany.pop();
        assertSame(3, kitchenWithMany.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("white corn"));
    }

}
