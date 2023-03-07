import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        double[] arrayNums = new double[15];
        for (int i = 0; i < arrayNums.length; i++) {

            double num = rnd.nextDouble(-15, 20);
            arrayNums[i] = num;
        }
        System.out.println(Arrays.toString(arrayNums));

        boolean foundNegative = false;

        double sum = 0.0;
        int count = 0;
        for (double num : arrayNums) {
            if (num < 0.0 && !foundNegative){
                foundNegative = true;
            }else if (num > 0.0 && foundNegative){
                sum += num;
                count++;
            }
        }
        double average = sum/count;
        System.out.println(average);

        for(int i = 0; i < arrayNums.length-1; i++) {
            for (int j = i+1; j<arrayNums.length; j++) {
                if(arrayNums[i] > arrayNums[j]) {
                    double num = arrayNums[i];
                    arrayNums[i] = arrayNums[j];
                    arrayNums[j] = num;
                    System.out.println(Arrays.toString(arrayNums));
                }

            }
        }

    }

}