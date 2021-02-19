public class Adapter {
    /**
     * This is the adapters add function. It uses the static method in the Matrix
     * class and adapts it to be functionally the same with a different interface.
     * 
     * @param l The left Matrix
     * @param r The right Matrix
     * @return Returns the Matrix that results from the operation.
     */
    public static Matrix add(Matrix l, Matrix r) {
        return Matrix.plus(l, r);
    }

    /**
     * This is the adapters sub function. It uses the static method in the Matrix
     * class and adapts it to be functionally the same with a different interface.
     * 
     * @param l The left Matrix
     * @param r The right Matrix
     * @return Returns the Matrix that results from the operation.
     */
    public static Matrix sub(Matrix l, Matrix r) {
        return Matrix.minus(l, r);
    }
}
