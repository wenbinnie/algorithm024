/**
 * 斐波那契数列，不要直接使用递归，会有大量的重复
 */
class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int f1 = 1;
        int f2 = 2;
        int count = 0;

        for(int i=3;i<=n;i++){
            count = f1 + f2;
            f1 = f2;
            f2 = count;
        }

        return count;

    }
}


/**
 * 最简单的动态规划，找到第 f(n) 与 前 f(n-1) 项的关系
 */
class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
}
