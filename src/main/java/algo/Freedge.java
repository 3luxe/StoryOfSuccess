package algo;

//LuxCampus task
public class Freedge {

    static boolean[][] input = {
            {true, false, true, false},
            {true, false, true, false},
            {true, false, true, false},
            {true, false, true, false}
    };
    public static void main(String[] args) {
        boolean[][] result = new Freedge().setHorizontally(input);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
    }

    public boolean[][] setHorizontally(boolean[][] b) {
        int size = b.length;
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++)
                    b[i][j] = true;
            }
            return b;
    }
}
