package test;

import org.junit.jupiter.api.Assertions;
import server.Number;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    void findNumberLost() {
        int[] test_array_1 = {1, 2, 3, 5};
        Assertions.assertEquals(Number.findNumberLost(test_array_1), 4);

        int[] test_array_2 = {5, 0, 1, 3, 2};
        Assertions.assertEquals(Number.findNumberLost(test_array_2), 4);

        int[] test_array_3 = {7, 9, 10, 11, 12};
        Assertions.assertEquals(Number.findNumberLost(test_array_3), 8);

        int[] test_array_4 = {1, 2, 3, 4};
        Assertions.assertEquals(Number.findNumberLost(test_array_4), 5);

        int[] test_array_5 = null;
        try {
            Number.findNumberLost(test_array_5);
        }catch (Exception e) {
            Assertions.assertTrue(true);
        }

        int[] test_array_6 = {1};
        Assertions.assertEquals(Number.findNumberLost(test_array_6), 2);

        int[] test_array_7 = {};
        try {
            Number.findNumberLost(test_array_7);
        }catch (Exception e) {
            Assertions.assertTrue(true);
        }
    }
}