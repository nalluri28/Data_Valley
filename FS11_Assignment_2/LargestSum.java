//1.Write a java program to find the sum of the 2nd and 3rd largest numbers in an array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSumOfSecondAndThirdLargest(values);
        System.out.println("Sum of 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSumOfSecondAndThirdLargest(int[] values) {
        Arrays.sort(values);
        int n = values.length;
        return values[n - 2] + values[n - 3];
    }
}