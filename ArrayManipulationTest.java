package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {
    ArrayManipulation arrayManipulation;

    @BeforeEach
    void setUp() {
        arrayManipulation = new ArrayManipulation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_to_get_sum(){
        int[] array = {2, 1, 2, 1, 2};
        int sum = arrayManipulation.getSum(array);
        assertEquals(8, sum);

        int[] anotherArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sumOfAnotherArray = arrayManipulation.getSum(anotherArray);
        assertEquals(10, sumOfAnotherArray);

    }

    @Test
    void test_get_minimum_value_in_array(){
        int[] array = { 2, 9, 1, 4, 5};
        int minimumValue = arrayManipulation.getMinimumValue(array);
        assertEquals(1, minimumValue);

        int[] anotherArray = {40, 100, 5, 1000, 60, -1, 0};
        int minimum = arrayManipulation.getMinimumValue(anotherArray);
        assertEquals(-1, minimum);
    }

    @Test
    void test_get_maximum_value_in_array(){
        int[] array ={0,4,8,9,10,6,3,5};
        int maximumValue =arrayManipulation.getMaximumValue(array);
        assertEquals(10, maximumValue);

    }

}