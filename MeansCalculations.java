import java.lang.Math;
public class MeansCalculations {

    public static double arithmeticMean(double[] values){
        //TODO calculate the arithmetic mean of values and return the double.
        double sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum/values.length;
    }
    public static double geometricMean(double[] values){
        //TODO calculate the geometric mean of values and return the double.
        double sum = 1;
        for(int i = 0; i < values.length; i++) {
            sum = sum*values[i];
        }
        return Math.pow(sum, 1.0/values.length);

    }
    public static double weightedArithmeticMean(double[] values, double[] weights ){
        //TODO calculate the weighted arithmetic mean of values with weights and return the double.
        double sum = 0;
        double totalWeight = 0;
        for (int i = 0; i < values.length; i++){
            sum += weights[i]*values[i];
            totalWeight += weights[i];
        }
        return sum/totalWeight;
    }
    public static double[] movingGeometricMean(double[] values){
        //TODO calculate the array of geometric means for values. The array you return should have the same length as the input array
        double[] result = new double[values.length];
        double sum = 1.0;
        for(int i = 0; i < result.length; i++) {
            result[i] = Math.pow(values[i] * sum, 1.0 / (i + 1));
            sum = sum * values[i];
        }
        return result;
    }



}
