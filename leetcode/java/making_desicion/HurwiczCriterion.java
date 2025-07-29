package making_desicion;

public class HurwiczCriterion {

    public static double[] hurwicz(double[][] matrix, double alpha) {
        double[] results = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double min = matrix[i][0];
            double max = matrix[i][0];
            for (double value : matrix[i]) {
                if (value < min) min = value;
                if (value > max) max = value;
            }
            results[i] = alpha * min + (1 - alpha) * max;
        }
        return results;
    }

    public static void main(String[] args) {
        double[][] matrix = {
                {10, 80},
                {20, 60},
                {30, 50}
        };
        double alpha = 0.6;
        double[] scores = hurwicz(matrix, alpha);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("A" + (i+1) + " H = " + scores[i]);
        }
    }
}
