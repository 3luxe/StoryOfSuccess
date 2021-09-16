package algo;

import java.util.LinkedList;
import java.util.List;

public class ArraysConverter {
    public List<Integer> convertToIntList(List<String> arr) {
        if (arr == null || arr.size() == 0) {
            return new LinkedList<>();
        }
        List<Integer> integerList = new LinkedList<>();
        for (String s : arr) {
            try {
                int i = Integer.parseInt(s);
                integerList.add(i);
            } catch (NumberFormatException e0) {
                System.err.println("Invalid String value: " + s);
            }
        }
        return integerList;
    }

    public List<String> convertToStringList(List<Integer> arr) {
//        List<String> stringList = new LinkedList<>();
//        try {
//            Integer i1 = Integer.valueOf("string");
//        } catch (NumberFormatException e1) {
//            System.err.println("Invalid int value: " + i);
//        }
//        return stringList;
        return null;
    }

    public int[] convertToIntArray(String[] arr) {
        return null; // Code here
    }

    public String[] convertToStringArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new String[0];
        }
        String s;
        String[] stringArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            s = String.valueOf(arr[i]);
            stringArr[i] = s;
        }
        return stringArr;
    }
}