package com.scottejames.aoc2017.util;

public class Helper {

    public static Integer[] splitStringToInegers(String s){
        Integer[] integers = StringArrayToInteger(s.split("\\s+"),-1);
        return integers;

    }
    public static Integer[] StringArrayToInteger(final String[] input, final int defaultValue) {
        Integer[] output = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            try {
                output[i] = Integer.parseInt(input[i]);
            } catch (NumberFormatException nfe) {
                System.err.println("Not a valid integer at index: " + i);
                System.err.println("Replacing with: " + defaultValue);
                output[i] = defaultValue;
            }
        }
        return output;
    }
}
