package algo;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysConverterTest {

    public ArraysConverter testClass = new ArraysConverter();

    @Test
    void convertToIntList() {
        List<Integer> expected = new LinkedList();
        expected.add(41);
        expected.add(42);
        expected.add(43);
        List<String> input = new LinkedList<>();
        input.add("41");
        input.add("42");
        input.add("43");
        List<Integer> actual = testClass.convertToIntList(input);
        assertIterableEquals(expected, actual);
    }

//    @Test
    void convertToStringList() {
    }

//    @Test
    void testConvertToIntArray() {
    }

    @Test
    void testConvertToStringArray() {
        String[] expected = new String[3];
        expected[0] = "41";
        expected[1] = "42";
        expected[2] = "43";
        int[] input = new int[3];
        input[0] = 41;
        input[1] = 42;
        input[2] = 43;
        String[] actual = testClass.convertToStringArray(input);
        assertArrayEquals(expected, actual);
    }
}