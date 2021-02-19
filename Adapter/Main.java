public class Main {
    public static void main(String[] ignore) {
        // First we make two matrices that we can work with.
        double a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        double b[][] = { { 2, 4, 5 }, { 3, 5, 4 }, { 4, 5, 6 } };
        Matrix l = new Matrix(a);
        Matrix r = new Matrix(b); // Build objects with them
        Matrix resultMatrix = Matrix.plus(l, r); // First we test the classes function itself
        System.out.println("Matrix l:");
        l.print();
        System.out.println("+");
        System.out.println("Matrix r:");
        r.print();
        System.out.println("\nResults in:");
        resultMatrix.print();
        System.out.println("\nMatrix l:");
        l.print();
        System.out.println("+");
        System.out.println("Matrix r:");
        r.print();
        System.out.println("\nResults in:");
        Matrix resultAdapter = Adapter.add(l, r); // Now we do it with the adapter
        resultAdapter.print();
    }
}
