package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        Integer sum =0;
        for (int i =0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        Integer sum = 1;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum * intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        return Double.valueOf(getSum(intArray)/intArray.length);
    }
}
