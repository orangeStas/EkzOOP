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
