public class Matrix {
    private double[][] entry;

    /**
     * Constructor builds the Matrix.
     * 
     * @param entry Takes the mathematical Matrix, and holds it.
     */
    public Matrix(double[][] entry) {
        this.entry = entry;
    }

    /**
     * This is the Matrix addition function. It is a static method that can be
     * called from anywhere and does matrix addition on the two parameters passed.
     * 
     * @param l The left Matrix to perform the operation on.
     * @param r The right Matrix to perform the operation on.
     * @return The function returns the resulting Matrix from the operation.
     */
    public static Matrix plus(Matrix l, Matrix r) {
        // Here is error checking, making sure proper inputs are accessed
        int lLength = l.entry.length;
        int rLength = r.entry.length;
        // Error checking the same as addition.
        if (lLength == rLength) {
            int lHeight = l.entry[0].length;
            int rHeight = r.entry[0].length;
            if (lHeight == rHeight) {
                double[][] newMatrix = new double[lLength][lHeight];
                for (int i = 0; i < lLength; ++i) { // Go accross the rows
                    for (int j = 0; j < lHeight; ++j) { // Go down the column
                        newMatrix[i][j] = l.entry[i][j] + r.entry[i][j]; // Now store the result.
                    }
                }
                return new Matrix(newMatrix);
            }
        }
        System.err.println("Error, Matrices are not the same length!");
        return null;
    }

    /**
     * This is the Matrix subtraction function. It is a static method that can be
     * called from anywhere and does matrix addition on the two parameters passed.
     * 
     * @param l The left Matrix to perform the operation on.
     * @param r The right Matrix to perform the operation on.
     * @return The function returns the resulting Matrix from the operation.
     */
    public static Matrix minus(Matrix l, Matrix r) {
        // Here is error checking, making sure proper inputs are accessed
        int lLength = l.entry.length;
        int rLength = r.entry.length;
        // Error checking the same as addition.
        if (lLength == rLength) {
            int lHeight = l.entry[0].length;
            int rHeight = r.entry[0].length;
            if (lHeight == rHeight) {
                double[][] newMatrix = new double[lLength][lHeight];
                for (int i = 0; i < lLength; ++i) { // Go accross the rows
                    for (int j = 0; j < lHeight; ++j) { // Go down the column
                        newMatrix[i][j] = l.entry[i][j] - r.entry[i][j]; // Now store the result.
                        // This process is the same, but with subtraction.
                    }
                }
                return new Matrix(newMatrix);
            }
        }
        System.err.println("Error, Matrices are not the same length!");
        return null;
    }

    /**
     * Utility function to print the matrix so we can display it and verify
     * validity.
     */
    public void print() {
        for (int i = 0; i < this.entry.length; ++i) { // We want to traverse the opposite way we add because we want
            for (int j = 0; j < this.entry[0].length; ++j) { // to print it per level
                System.out.print(" " + this.entry[i][j] + " ");
            }
            System.out.println();
        }
    }
}