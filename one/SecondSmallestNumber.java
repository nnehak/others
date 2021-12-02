package com.neha.gs.one;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {12,13,1,10,34,1};
        System.out.println(secondSmallest(new int[]{5, 4, 3, 2, 1}) == 2);
        System.out.println(secondSmallest(new int[]{}) == 0);
        System.out.println(secondSmallest(new int[]{0}) == 0);
        System.out.println(secondSmallest(new int[]{0, 1}) == 1);
        System.out.println(secondSmallest(new int[]{-1, 0, 1, -2, 2}) == -1);
        System.out.println(secondSmallest(new int[]{Integer.MAX_VALUE}) == 0);
        System.out.println(secondSmallest(new int[]{1, 1, 2}) == 1);
        System.out.println(secondSmallest(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}) == 0);

    }

    public static int secondSmallest(int[] arr) {

        if (arr.length < 2) {
            return 0;
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int res;

        for (int i = 0; i < arr.length; i++) {
            res = arr[i];
            if (res < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = res;
            } else if (res < secondSmallest) {
                secondSmallest = res;
            }
        }

        return secondSmallest;

    }

}
