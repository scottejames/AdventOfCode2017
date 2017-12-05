package com.scottejames.aoc2017;

import com.scottejames.aoc2017.util.FileHelper;
import com.scottejames.aoc2017.util.Helper;

public class Day2CheckSum {
    public static int sumPartOne(String string){
        Integer[] intList = Helper.splitStringToInegers(string) ;
        int s = Integer.MAX_VALUE;
        int l = 0;

        for (Integer i : intList){
            if (i > l) l = i;
            if (i < s) s = i;
        }

        return l-s;
    }

    public static int sumPartTwo(String string) {
        Integer[] intList = Helper.splitStringToInegers(string);

        for (int i = 0; i <= intList.length - 1; i++)
            for (int j = 0; j <= intList.length - 1; j++) {
                if (i != j) {
                    System.out.println("Checking " + i + " ," + j);
                    if (intList[i] % intList[j] == 0) {
                        int result = intList[i] / intList[j];
                        System.out.println("line " + string + " returning :" + result);
                        return result;
                    }
                }
            }
        return 0;
    }


    public static void main(String [] args){


        String fileName = "Day2_data.txt";
        FileHelper fh = new FileHelper(fileName);
        int resultOne = fh.performIntActionOnLine(fileName,Day2CheckSum::sumPartOne);
        int resultTwo = fh.performIntActionOnLine(fileName,Day2CheckSum::sumPartTwo);

        System.out.println("Part1: " + resultOne);
        System.out.println("Part2: " + resultTwo);


    }
}
