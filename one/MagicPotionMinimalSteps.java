package com.neha.gs.one;

public class MagicPotionMinimalSteps {

    private static Integer minimalSteps(String ing){
        int n = ing.length();
        if(n == 0){
            return 0;
        }

        Integer[] dp = new Integer[n];
        for(int i=0;i<n;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 1;
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[i], dp[i-1]+1);

            //if string cab be replicated, we need to update at (2*i +1)
            if(2*i+1<n
            && ing.substring(0,i+1).equals(ing.substring(i+1,2*i+2))){
                dp[2*i+1] = dp[i]+1;
            }

        }
        return dp[n-1];
    }

    public static void main(String[] args){
        System.out.println(minimalSteps("ABCDABCE") == 8);
        System.out.println(minimalSteps("ABCABCE") == 5);
        System.out.println(minimalSteps("AAAAAA") == 4);
        System.out.println(minimalSteps("AAAABBBB") == 7);
        System.out.println(minimalSteps("ABABCABABCD") == 6);
    }
}
