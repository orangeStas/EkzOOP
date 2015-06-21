/**
 * Created by OrangeUser on 6/17/2015.
 */
public class Matrix {
    private boolean[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        matrix = new boolean[rows][cols];
    }

    public Matrix(boolean[][] matrix) {
        this.matrix = matrix;
        rows = matrix.length;
        cols = matrix[0].length;
    }

    public void setMatrixEl(int i, int j, boolean value) {
        matrix[i][j] = value;
    }

    public boolean[][] getMatrix(){
        return matrix;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public boolean getElement(int i, int j) {
        return matrix[i][j];
    }

    public void transpose(){
        boolean[][] transpMatrix = new boolean[cols][rows];

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                transpMatrix[j][i] = matrix[i][j];
            }
        }

        rows = cols;
        cols = matrix.length;
        matrix = transpMatrix;
    }

    public Matrix multiple(Matrix matrix1) {
        int m = rows;
        int n = matrix1.cols;
        int o = matrix1.rows;
        boolean[][] res = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] |= matrix[i][k] & matrix1.getMatrix()[k][j];
                }
            }
        }

        return new Matrix(res);

    }


}

class TestMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 2);
        matrix.setMatrixEl(0,0, false);
        matrix.setMatrixEl(0,1, true);
        matrix.setMatrixEl(1,0, false);
        matrix.setMatrixEl(1,1, true);
        matrix.setMatrixEl(2,0, false);
        matrix.setMatrixEl(2,1, false);

        for (int i =0 ; i < matrix.getRows(); i++)
        {
            for (int j = 0; j < matrix.getCols(); j++){
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }

        matrix.transpose();
        System.out.println();

        for (int i =0 ; i < matrix.getRows(); i++)
        {
            for (int j = 0; j < matrix.getCols(); j++){
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("wait");

    }



}
