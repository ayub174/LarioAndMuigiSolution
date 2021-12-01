//Junit tests


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Tests {

    @Test
    public static void testNewList()
    {
        Assertions.assertEquals(new int[] {1,2,3,4,5},Solution.newList(new int[] {1,2,3,4,5}));
    }
}

