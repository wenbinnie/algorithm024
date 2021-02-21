/**
 * 2.00000
 * -2147483648 test cast failed
 *
 *
 *
 */

// 分治模版  1.terminator 2. process(split big problem) 3. drill down(sub problems),merge  4.reverse states
class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1/x;
        }
        return doPow(x, n);
    }

    private double doPow(double x,long N){
        if(N == 0){
            return 1D;
        }

        double tmp = doPow(x,N/2);
        return N%2==0?tmp * tmp :tmp * tmp * x;
    }
}
