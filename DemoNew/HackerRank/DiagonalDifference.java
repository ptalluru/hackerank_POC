package com.demo.cg.DemoNew.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        //Checking the list :-[[11, 2, 4], [4, 5, 6], [10, 8, -12]]
        int sumFromTop = 0;
        int sumFromBottom = 0;
        int countTop = 0;
        int countBottom = 0;
        for (List<Integer> lists : arr) {
            int[] list = lists.stream().mapToInt(Integer::intValue).toArray();
            sumFromTop=sumFromTop+list[countTop];
            countTop++;
        }
        Collections.reverse(arr);
        for (List<Integer> reverseLists : arr) {
            int[] list = reverseLists.stream().mapToInt(Integer::intValue).toArray();
            sumFromBottom=sumFromBottom+list[countBottom];
            countBottom++;
        }
        int diff = sumFromTop-sumFromBottom;
        int result = Math.abs(diff);
        return result;
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result1.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
