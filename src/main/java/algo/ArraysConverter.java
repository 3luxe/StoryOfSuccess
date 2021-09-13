package algo;

import java.util.LinkedList;
import java.util.List;

public class ArraysConverter {
    public List<Integer> convertToIntList(List<String> arr) {
        try {
            String str = new String("12");
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e0){
            System.err.println("Invalid value");
        }
        return new LinkedList<>();
    }

    public List<String> convertToStringList(List<Integer> arr) {
        try{
            Integer i1 = new Integer("5");
            System.out.println(i1);
        }catch (NumberFormatException e1){
            System.err.println("Invalid value");
        }
        return new LinkedList<>();
    }

    public int[] convertToIntList(String[] arr) {
        return new int[0]; // Code here
    }

    public String[] convertToStringList(int[] arr) {
        return new String[0]; // Code here
    }
}