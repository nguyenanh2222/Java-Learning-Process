package org.example.hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Array2D {

    public static int hourglassSum(List<List<Integer>> arr) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> chunk = new ArrayList<>();
        for(int n = 0; n < arr.size()-2; n++) {
            for (int m = 0; m < arr.get(n).size() - 2; m++) {
                int result = 0;
                int count = 1;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp.add(arr.get(i + n).get(j + m));
                    }
                        if (count == 2) {
                            result += List.copyOf(temp).get(1);
                        }
                        if (count != 2) {
                            for (int item : List.copyOf(temp)) {
                                result += item;
                            }
                        }
                        temp.clear();
                        count += 1;
                    }
                    chunk.add(result);
                }
            }

            int max = chunk.get(0);
            for (int i = 1; i < chunk.size(); i++) {
                if (chunk.get(i).compareTo(max) > 0) {
                    max = chunk.get(i);
                }
            }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
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

        int result = hourglassSum(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
