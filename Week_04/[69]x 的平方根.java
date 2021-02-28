/**
 * 用二分法前，需要考虑是否是单调递增或者递减的
 */

class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        long l=1,r=x;
        long mid= 1;

        while(l<=r){
            mid = (r-l)/2+l;
            if(mid * mid > x){
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return (int)r;
    }
}

class Solution {
    public int mySqrt(int x) {
        int l = 0, r= x;
        int res = -1;
        while(l <= r){
            int mid = (r-l)/2 + l;
            if((long)mid*mid <= x){
                res = mid;
                l = mid + 1;
            }else{
                r= mid -1;
            }

        }
        return res;
    }
}

class Solution {
    public int mySqrt(int x) {
        long r = x;

        while(r*r>x){
            r = (r + x/r)/2;
        }
        return (int)r;

    }
}
