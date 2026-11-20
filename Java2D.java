import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().split(" ");
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                row.add(Integer.parseInt(arrRowTempItems[j]));
            }
            arr.add(row);
        }

        int maxSum = Integer.MIN_VALUE;

        // Traverse for hourglass (only till 3x3 possible)
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int sum =
                        arr.get(i).get(j) +
                        arr.get(i).get(j + 1) +
                        arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) +
                        arr.get(i + 2).get(j + 1) +
                        arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);

    }
}
