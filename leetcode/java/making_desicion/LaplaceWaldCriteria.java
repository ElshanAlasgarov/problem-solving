package making_desicion;

public class LaplaceWaldCriteria {
    public static double[] laplace(double[][] matrix) {
        double[] results = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (double val : matrix[i]) {
                sum += val;
            }
            results[i] = sum / matrix[i].length;
        }
        return results;
    }

    public static double[] wald(double[][] matrix) {
        double[] results = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double min = matrix[i][0];
            for (double val : matrix[i]) {
                if (val < min) min = val;
            }
            results[i] = min;
        }
        return results;
    }

    public static void main(String[] args) {
        double[][] matrix = {
                {30, 40, 50},
                {20, 50, 70},
                {60, 20, 20}
        };

        double[] laplace = laplace(matrix);
        double[] wald = wald(matrix);

        System.out.println("Laplas nəticələri:");
        for (int i = 0; i < laplace.length; i++) {
            System.out.println("A" + (i+1) + " = " + laplace[i]);
        }

        System.out.println("\nVald nəticələri:");
        for (int i = 0; i < wald.length; i++) {
            System.out.println("A" + (i+1) + " = " + wald[i]);
        }
    }
}
