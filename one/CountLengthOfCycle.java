package com.neha.gs.one;

import java.util.HashMap;
import java.util.Map;

public class CountLengthOfCycle {

    public static void main(String[] args){
        boolean testPassed = true;
        testPassed &= countLengthOfCycle(new int[]{1,0}, 0) == 2;
        testPassed &= countLengthOfCycle(new int[]{1,2,0}, 0) == 3;
        testPassed &= countLengthOfCycle(new int[]{1,1}, 0) == 1;
        testPassed &= countLengthOfCycle(new int[]{1,3,0,1}, 0) == 2;
        testPassed &= countLengthOfCycle(new int[]{7}, 0) == -1;
        System.out.println(testPassed);
    }

    //[1,0], 0 => 2
    //[1,2,0] => 3
    //from startIndex follow index it points to until you hit the cycle,
    // return lenght of cycle and if no cycle return -1
    static int countLengthOfCycle(int[] arr, int startIndex){
        Map<Integer, Integer> visited = new HashMap<>();
        int count = 1;
        int index = startIndex;
        while(!visited.containsKey(index)){
            if(arr[index]> arr.length) return -1;
            visited.put(index, count);
            count++;
            index=arr[index];
        }
        return count - visited.get(index);
    }
}
