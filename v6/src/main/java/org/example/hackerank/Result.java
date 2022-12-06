package org.example.hackerank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
    public static int[] reverseArray(int[] INTEGER_ARRAY){
        int[] NEW_INTEGER_ARRAY = new int[INTEGER_ARRAY.length];
        int j = 0;
        for(int i = INTEGER_ARRAY.length-1; i >= 0; i-- ){
            NEW_INTEGER_ARRAY[j] = INTEGER_ARRAY[i];
            j++;
        }
        return NEW_INTEGER_ARRAY;
}

    public static void main(String[] args) throws IOException {
        int[] arr = {10, 20, 30, 40};
        int[] res = Result.reverseArray(arr);
        System.out.println(Arrays.toString(Arrays.stream(res).toArray()));


    }
}