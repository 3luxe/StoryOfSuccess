package algo;

class TryWhileAsLoop {
    private static String str = new String("algorythms");
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(" " + str);
            i++;
        }
    }
}