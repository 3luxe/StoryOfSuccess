package algo;

import java.util.LinkedList;
import java.util.List;

class TryWhileAsLoop {

    String algorythms = new String("algorythms");

    public static void main(String[] args) {
        TryWhileAsLoop e = new TryWhileAsLoop();
        e.generateList().forEach(System.out::println);
    }

    public List<String> generateList() {
        List<String> result = new LinkedList<>();
        int i = 1;
        while (i <= 10) {
            i = i + 1;
            result.add(algorythms);
        }
        return result;
    }
}