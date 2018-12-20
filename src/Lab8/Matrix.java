package Lab8;


public class Matrix {
    private final int[][] matrix;
    public int length;
    public int getColumsNum;
    public int getRowsNum;
    public int getElement;
    public int getLength;

    public Matrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("Dimensions must be greater than zero");
        }
        matrix = new int[rows][cols];
    }

    void setElement(int row, int column, int value) {
        checkArgumentsIsLegal(row, column);
        matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        checkArgumentsIsLegal(row,column);
        return matrix[row][column];
    }

    int getRowsNum() {
        return matrix.length;
    }
    int getLength(){
        return length;
    }
    int getColumnsNum() {
        return matrix[0].length;
    }

      private void checkArgumentsIsLegal(int row, int column) {
        if (row < 0 || row >= getRowsNum()) {
            throw new IllegalArgumentException("Illegal row index");
        }

        if (column < 0 || column >= getColumnsNum()) {
            throw new IllegalArgumentException("Illegal column index");
        }
    }

    Matrix multiply(Matrix multiplier) {

        int thisRows = getRowsNum();
        int thisCols = getColumnsNum();

        int otherRows = multiplier.getRowsNum();
        int otherCols = multiplier.getColumnsNum();
        if (thisCols != otherRows) {
            throw new IllegalArgumentException("Exception");
        }
        Matrix result = new Matrix(thisRows, otherCols);

        for (int thisRow = 0; thisRow < thisRows; ++thisRow)
            for (int otherCol = 0; otherCol < otherCols; ++otherCol)
                for (int thisCol = 0; thisCol < thisCols; ++thisCol) {
                    result.matrix[thisRow][otherCol] += matrix[thisRow][thisCol]
                            * multiplier.getElement(thisCol, otherCol);
                }

        return result;
    }
    
}



