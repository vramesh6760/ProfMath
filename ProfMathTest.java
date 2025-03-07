package profmath;


public class ProfMathTest {
    public static void main(String[] args) {
        double[][] data = {
                {4, 3},
                {6, 3}
        };

        Matrix A = new Matrix(data);
        LUDecomposition lu = new LUDecomposition(A);

        System.out.println("L Matrix:");
        printMatrix(lu.getL());

        System.out.println("U Matrix:");
        printMatrix(lu.getU());
    }

    private static void printMatrix(Matrix M) {
        for (int i = 0; i < M.rows; i++) {
            for (int j = 0; j < M.cols; j++) {
                System.out.printf("%8.4f ", M.get(i, j));
            }
            System.out.println();
        }
    }
}


