package Lab7;



public class Lab7Fin {
    public static void main(String arg[]) {
        int mat[][] = {{1, 2, 3, -1}, {-1, -5, -7, 8}, {1, 2, -3, 0}};

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < 0) count++;
            }
        }
        System.out.println("Count is: " + count);
    }
}