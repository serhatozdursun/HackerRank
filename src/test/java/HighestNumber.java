/*
# 1. Find the Largest Element in an Array
# Given an array of integers, find the largest element.
        #
        # Java Solution:
*/

public class HighestNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        System.out.println(highestNumber(arr));  // Output: 9
    }

    public static int highestNumber(int[] arr){
        int highest = 0;
        for(int i: arr){
            if (i > highest) {
                highest = i;
            }
        }

        return highest;
    }
}


