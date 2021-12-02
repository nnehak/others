package com.neha.gs.one;

public class SmallestNumberInRotatedArray {
    public static void main(String[] args) {
        //second smallest number in a rotated array
        //array was previously sorted
        //O(log n) run time
        System.out.println(smallestInArr(new int[] {3,4,5,6,1,2}) == 1);
        System.out.println(smallestInArr(new int[] {2,1}) == 1);
        System.out.println(smallestInArr(new int[] {1}) == 1);
        System.out.println(smallestInArr(new int[] {1,2,3,4,5,6}) == 1);
        System.out.println(smallestInArr(new int[] {4,1,2,3}) == 1);
    }

    public static int smallestInArr(int[] a){
        return smallest(a, 0,a.length -1);

    }

    public static int smallest(int[] a, int left, int right) {
        if (left == right) {
            return a[left];
        }

        if(left > right)
            return a[0];

        int mid = (left + right) / 2;
        if(mid<right && a[mid] > a[mid + 1])
            return a[mid+1];
        if(mid>left && a[mid-1] > a[mid])
            return a[mid];
        if(a[right] > a[mid])
            smallest(a, left, mid-1);

        return smallest(a, mid+1, right);
    }
}
